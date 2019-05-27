package ejercicio08;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) throws IOException{
        /* Diseñe un programa que permita jugar guayabita, primero se ingresaran
         * la cantidad de Usuarios, luego en un arreglo llenar los nombres de 
         * jugadores, el acumulado se debe mostrar antes de cada tiro, cada 
         * jugador tendrá un tiro Inicial si este es 1 o 6 se pierde y debe 
         * colocar una moneda en el acumulado, si es otro número apostara hasta
         * el máximo del acumulado, ganara el total apostado si el segundo Tiro 
         * es mayor que el primer tiro, de lo contrario colocara en el acumulado
         * lo apostado, el juego se repetirá siempre y cuando el acumulado sea 
         * mayor que 0 (según las reglas vistas En la clase presencial).
         */
        
        Scanner lector = new Scanner(System.in);
        Guayabita guayabita = new Guayabita();
        int repetir = 1, cant = 0, pozo = 0, dado1 = 0, dado2 = 0, apostado = 0;
        
        while (repetir == 1) {
            System.out.println("Bienvenido a la guayabita.");
            System.out.println("");
            
            System.out.print("Por favor ingrese la cantidad de usuarios: ");
            
            do {
                cant = lector.nextInt();
                
                if (cant < 2 || cant > 6) {
                    System.out.println(cant + " no es un valor válido.");
                    System.out.print("Por favor ingrese de nuevo la cantidad de"
                            + " usuarios: ");
                }
            } while (cant < 2 || cant > 6);

            pozo = cant;
            String[] nom = new String[cant];
            nom = guayabita.llenarNombres(cant);

            for (int i = 0; i < cant; i++) {
                System.out.println("Es el turno de: " + nom[i]);
                System.out.println("Oprima enter para lanzar el dado");
                System.in.read();
                System.out.println("Su resultado es: ");
                dado1 = guayabita.lanzarDado();
                System.out.println(dado1);

                if (dado1 == 1 || dado1 == 6) {
                    System.out.println(nom[i] + " ha perdido");
                    pozo = pozo + 1;
                } else {
                    do {
                        System.out.println("Cuanto desea apostar entre 1 y " + pozo);
                        apostado = lector.nextInt();
                        if (apostado < 1 || apostado > pozo) {
                            System.out.println("Error, no se puede apostar esta cifra");
                            System.out.println("Vuelva a intentarlo");
                        }
                    } while (apostado < 1 || apostado > pozo);

                    System.out.println("Oprima enter para lanzar nuevamente el dado");
                    System.in.read();
                    dado2 = guayabita.lanzarDado();
                    System.out.println(dado2);

                    System.out.print(nom[i]);

                    if (dado2 > dado1) {
                        System.out.print(" ha ganado");
                        pozo = pozo - apostado;
                    } else {
                        System.out.print(" ha perdido");
                        pozo = pozo + apostado;
                    }

                    System.out.println("");

                    if (pozo == 0) {
                        i = cant - 1;
                        System.out.println(nom[i] + " ha ganado");
                    }
                }
            }
            
            System.out.println("");
            System.out.println("Digite 1 para repetir el programa");
            System.out.print("De lo contrario digite otro número: ");
            repetir = lector.nextInt();
            System.out.println("");
            System.out.println("");
        }
    }
}
