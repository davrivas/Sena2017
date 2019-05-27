package edu.ficha1365295.sintonizador;

import javax.swing.JSpinner.DefaultEditor;

public class SintonizadorAM extends javax.swing.JFrame {
    Accion accion; // Declaro el objeto de tipo Accion
    // Declaro la variable que me sirve para poner la frecuencia
    int frecuencia;
    
    public SintonizadorAM() {
        initComponents();
        this.accion = new Accion(); // Defino el valor de accion
        // Defino el valor de frecuencia con el valor que hay en el spinner
        this.frecuencia =  (Integer) spnSintonizador.getValue();
        /* En donde se muestra la frecuencia lo pongo como el valor que se
         * declara en la variable frecuencia
         */
        this.lblFrecuencia.setText(frecuencia + "kHz");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnSintonizador = new javax.swing.JSpinner();
        pnlFrecuencia = new javax.swing.JPanel();
        lblFrecuencia = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        spnSintonizador.setModel(new javax.swing.SpinnerNumberModel(1000, 530, 1610, 10));
        spnSintonizador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                catchValueFromSpinner(evt);
            }
        });

        pnlFrecuencia.setBackground(new java.awt.Color(0, 0, 0));

        lblFrecuencia.setBackground(new java.awt.Color(0, 0, 0));
        lblFrecuencia.setForeground(new java.awt.Color(255, 255, 255));
        lblFrecuencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlFrecuenciaLayout = new javax.swing.GroupLayout(pnlFrecuencia);
        pnlFrecuencia.setLayout(pnlFrecuenciaLayout);
        pnlFrecuenciaLayout.setHorizontalGroup(
            pnlFrecuenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFrecuencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        pnlFrecuenciaLayout.setVerticalGroup(
            pnlFrecuenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFrecuenciaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setText("Sintonizador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addComponent(pnlFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnSintonizador, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlFrecuencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spnSintonizador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void catchValueFromSpinner(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_catchValueFromSpinner
        // Defino el valor de frecuencia con el valor que hay en el spinner
        frecuencia = (Integer) spnSintonizador.getValue();
        /* Mediante el método setFrecuencia de la clase Accion, defino el valor
         * de frecuencia
         */
        frecuencia = accion.setFrecuencia(frecuencia);
        // Defino el valor de frecuencia en el spinner
        spnSintonizador.setValue(frecuencia);
        /* En donde se muestra la frecuencia lo pongo como el valor que se
         * declara en la variable frecuencia
         */
        lblFrecuencia.setText(frecuencia + "kHz");
    }//GEN-LAST:event_catchValueFromSpinner

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SintonizadorAM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblFrecuencia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlFrecuencia;
    private javax.swing.JSpinner spnSintonizador;
    // End of variables declaration//GEN-END:variables
}
