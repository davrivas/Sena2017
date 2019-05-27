package ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /* Diseñe un programa (en consola) con 2 matrices, la primera de 4 por
         * 10 con 10 productos con el ID, nombre de producto, precio unidad, y
         * si tiene o no IVA, la segunda se debe llenar dinámicamente, debe ser
         * de 11 por 7 con el ítem, ID, nombre producto, cantidad valor
         * unidad, IVA, valor total. Se creara una factura el programa
         * solicitara en consola que digite el id del producto que desea llevar,
         * luego la cantidad y si desea llevar otro producto, puede llevar hasta
         * 10 productos el usuario, luego imprimirá la factura.
         */
        
        // Crea el objeto lector de la clase Scanner para leer datos
        Scanner lector = new Scanner(System.in);
        Matrices matrices = new Matrices();
        String[][] tienda = new String[11][4];
        String[][] factura = new String[11][7];
        int repetir = 1, art, cantidad, ct = 0, cantFact = 0;
        double vt = 0, tap = 0;
        String otro;
        
        while (repetir == 1) {
            System.out.println("Bienvenido a la matriz");
            System.out.println("");

            //Se inician las matrices con valores predeterminados
            tienda = matrices.iniciarMatriz(tienda, 1);
            factura = matrices.iniciarMatriz(factura, 2);

            // Se llena la tienda
            tienda = matrices.llenarTienda(tienda, 11, 4);
            // Se muestra la tienda (no hay total por eso el valor 0)
            matrices.mostrarMatriz(tienda, 11, 4, 1, 0);

            // Se llena la factura
            for (int j = 1; j < 11; j++) {
                do {
                    System.out.print("Digite el  # del articulo que desea "
                            + "llevar: ");
                    art = lector.nextInt();
                    if (art > 10 || art < 1) {
                        System.out.println("Error: opción errada");
                    }
                } while (art > 10 || art < 1);
                
                do {
                    System.out.print("Digite la cantidad de  articulos que "
                            + "desea llevar: ");
                    cantidad = lector.nextInt();
                    
                    if (cantidad > 10 || cantidad < 1) {
                        System.out.println("Error: opcion errada");
                    }

                    if (ct + cantidad > 10) {
                        System.out.println("Error: cantidad maxima de 10 "
                                + "artículos");
                    }
                } while (cantidad > 10 || cantidad < 1 || ct + cantidad > 10);

                for (int i = 1; i < 11; i++) {
                    if (art == Integer.parseInt(tienda[i][0])) {
                        factura[j][1] = tienda[i][0];
                        factura[j][2] = tienda[i][1];
                        factura[j][3] = " " + cantidad + "\t";
                        ct = ct + cantidad;
                        factura[j][4] = tienda[i][2];
                        factura[j][5] = tienda[i][3];

                        if ("si".equals(tienda[i][3]) || 
                                "Si".equals(tienda[i][3]) || 
                                "SI".equals(tienda[i][3])) {
                            vt = cantidad * (Integer.parseInt(tienda[i][2])) * 
                                    1.16;
                        } else if ("no".equals(tienda[i][3]) || 
                                "No".equals(tienda[i][3]) || 
                                "NO".equals(tienda[i][3])) {
                            vt = cantidad * (Integer.parseInt(tienda[i][2]));
                        }
                        factura[j][6] = "" + vt;
                        tap = tap + Double.parseDouble(factura[j][6]);
                    }
                }
                System.out.println("¿Desea llevar otro articulo?\n"
                        + "Marque \"s\", de lo contrario otra letra:");
                otro = lector.next();
                if (!"s".equals(otro) || ct >= 10) {
                    cantFact = j;
                    j = j + 10;
                }
            }
            
            // Se muestra la factura con el total
            matrices.mostrarMatriz(factura, cantFact+1, 7, 2, tap);

            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }
    }
}
