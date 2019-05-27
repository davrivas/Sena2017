package pedro;

import java.awt.event.KeyEvent;

public class PedroResponde extends javax.swing.JFrame {

    Respuesta resp = new Respuesta();
    private final String frase = "Pedro por favor de responder esta pregunta porfa                                                                                                                                                                                                                                                                   ";
    private String caracter = "", rta = "";
    private int bandera = 0, indice = 0;
    
    public void reiniciaVariables() {
        caracter = "";
        rta = "";
        bandera = 0;
        indice = 0;
        txtPregunta.setText("");
        txtPeticion.setText("");
        lblRespuesta.setText("Respuesta:");
        txtPeticion.requestFocus(); // Para que aparezca en el input de peticion
    }
    
    public void darRespuesta() {
        if (rta.length() > 0) {
            lblRespuesta.setText("Respuesta: " + rta);
        } else {
            lblRespuesta.setText("Respuesta: " + resp.respuestas());
        }
        
        txtPeticion.requestFocus(); // Para que aparezca en el input de peticion
    }

    public PedroResponde() {
        initComponents();
        txtPeticion.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPeticion = new javax.swing.JTextField();
        txtPregunta = new javax.swing.JTextField();
        lblPeticion = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        lblPedroResponde = new javax.swing.JLabel();
        btnInvocar = new javax.swing.JButton();
        lblRespuesta = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtPeticion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPeticionKeyTyped(evt);
            }
        });

        txtPregunta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPreguntaKeyTyped(evt);
            }
        });

        lblPeticion.setText("Petición");

        lblPregunta.setText("Pregunta");

        lblPedroResponde.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPedroResponde.setText("Pedro responde");

        btnInvocar.setText("Invocar a Pedro");
        btnInvocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvocarActionPerformed(evt);
            }
        });

        lblRespuesta.setText("Respuesta:");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPedroResponde)
                .addGap(108, 108, 108))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPeticion)
                                    .addComponent(lblPregunta))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPeticion, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                    .addComponent(txtPregunta)))
                            .addComponent(lblRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnInvocar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPedroResponde)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeticion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeticion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPregunta))
                .addGap(37, 37, 37)
                .addComponent(lblRespuesta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInvocar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPeticionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPeticionKeyTyped
        if (evt.getKeyChar() == '.') {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);

            if (bandera == 0) {
                bandera = 1;
            } else if (bandera == 1) {
                bandera = 2;
            }
        }

        if (bandera == 1) {
            rta += evt.getKeyChar();
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            caracter += frase.charAt(indice);
            txtPeticion.setText(caracter);
            indice++;
        }
        
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            darRespuesta();
        }
        
        if (evt.getKeyChar() == KeyEvent.VK_ESCAPE) {
            reiniciaVariables();
        }
    }//GEN-LAST:event_txtPeticionKeyTyped

    private void btnInvocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvocarActionPerformed
        darRespuesta();
    }//GEN-LAST:event_btnInvocarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        reiniciaVariables();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtPreguntaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreguntaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            darRespuesta();
        }
        
        if (evt.getKeyChar() == KeyEvent.VK_ESCAPE) {
            reiniciaVariables();
        }
    }//GEN-LAST:event_txtPreguntaKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PedroResponde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedroResponde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedroResponde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedroResponde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedroResponde().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInvocar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel lblPedroResponde;
    private javax.swing.JLabel lblPeticion;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JTextField txtPeticion;
    private javax.swing.JTextField txtPregunta;
    // End of variables declaration//GEN-END:variables
}
