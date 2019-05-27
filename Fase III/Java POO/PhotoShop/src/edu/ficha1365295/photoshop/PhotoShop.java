package edu.ficha1365295.photoshop;

import java.util.ArrayList;
import java.util.Scanner;

public class PhotoShop {

    static Scanner scanner = new Scanner(System.in);
    static Tiempo tiempo = new Tiempo();
    static ArrayList<Event> eventos = new ArrayList<>();

    public static void main(String[] args) {
        int repetir = 1, dia = 0;
        String tipoInstitucion = "";
        boolean[] dias = new boolean[31];
        dias = tiempo.setDias(dias); // todos los días están vacíos

        do {
            try {
                if (tiempo.revisarDias(dias) == false) {
                    System.out.println("1 Para registrar evento (solo se permite un evento por día).");
                }

                System.out.println(
                    "2 Para listar eventos (incluir precio a pagar)\n" +
                    "3 Para listar eventos por tipo de institución\n" +
                    "4 Para listar evento por día\n" +
                    "5 Para salir"
                );
                
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        if (tiempo.revisarDias(dias) == false) {
                            Event evento = new Event();
                            System.out.println("Registrar evento");
                            
                            String nombre,
                                    direccion;
                            int numeroGraduados,
                                    horaInicio = 0;
                            
                            System.out.println("Digite el nombre de la institución");
                            nombre = scanner.nextLine();
                            
                            System.out.println("Digite la dirección");
                            direccion = scanner.nextLine();
                            
                            System.out.println("Digite que tipo de institución "
                                    + "(colegio o universidad)");
                            tipoInstitucion = scanner.nextLine();
                            if (tipoInstitucion.equalsIgnoreCase("colegio") || tipoInstitucion.equalsIgnoreCase("universidad")) {
                                //throw new RuntimeException("No pertenece");
                            } else {
                                throw new RuntimeException("No pertenece");
                            }

                            System.out.println("Digite el número de graduados");
                            numeroGraduados = Integer.valueOf(scanner.next());
                            
                            System.out.println("Digite el valor del registro fotografico");
                            Integer regFoto = Integer.valueOf(scanner.next());
                            
                            // Revisar días
                            boolean revisar;
                            do {
                                revisar = true;
                                do {
                                    System.out.println("Digite el dia del evento "
                                            + "(entre 1 y 31)");

                                    if (tiempo.diasVacios(dias) == true) {
                                        System.out.println("Días escogidos");
                                        for (int i = 0; i < 31; i++) {
                                            if (dias[i] == true) {
                                                System.out.print((i + 1) + " ");
                                            }
                                        }
                                        System.out.println("de diciembre");
                                    }

                                    dia = scanner.nextInt();
                                    scanner.nextLine();

                                    if (dia < 1 || dia > 31) {
                                        System.out.println("El día debe ser entre 1 y 31");
                                    }
                                } while (dia < 1 || dia > 31);

                                for (int i = 0; i < 31; i++) {
                                    if (dias[dia - 1] == true) {
                                        revisar = false;
                                    }
                                }

                                if (revisar == false) {
                                    System.out.println("Ese día está escogido.");
                                }
                            } while (revisar == false);
                            for (int i = 0; i < 31; i++) {
                                dias[dia - 1] = true;
                            }

                            System.out.println("Digite la hora de inicio");
                            horaInicio = scanner.nextInt();
                            
                            //creamos un institucion 
                            Institucion institucion = new Institucion();
                            institucion.setNumeroGraduados(numeroGraduados);
                            institucion.setTipoInstitucion(tipoInstitucion);
                            institucion.setDireccion(direccion);
                            institucion.setNombre(nombre);
                            
                            //creamos el evento
                            evento.setDia(dia);
                            evento.setHoraInicio(horaInicio);
                            
                            //agregamos la institucion creada asociada al evento
                            evento.setInstitucion(institucion);
                            evento.setValorRegFotogradico(regFoto);
                            eventos.add(evento);
                        } else {
                            System.out.println("No se pueden registrar más eventos");
                        }

                        break;
                    case 2:
                        if (tiempo.diasVacios(dias) == true) {
                            //lista eventos 
                            listaEvetos.ListarEventos(eventos);

                        } else {
                            System.out.println("No hay eventos registrados.");
                        }
                        break;
                    case 3:
                        if (tiempo.diasVacios(dias) == true) {
                            //por tipo de institucion
                            System.out.println("Digite que tipo de institución");
                            tipoInstitucion = scanner.nextLine();
                            if (tipoInstitucion.equalsIgnoreCase("colegio") || tipoInstitucion.equalsIgnoreCase("universidad")) {
                                //throw new RuntimeException("No pertenece");
                                listaEvetos.ListarEventosPorTipo(eventos, tipoInstitucion);
                            } else {
                                System.out.println("no tenemos ese tipo");
                            }
                        } else {
                            System.out.println("No hay eventos registrados.");
                        }
                        break;
                    case 4:

                        if (tiempo.diasVacios(dias) == true) {
                            do {
                                System.out.println("Digite el dia del evento");

                                System.out.println("Días escogidos");
                                for (int i = 0; i < 31; i++) {
                                    if (dias[i] == true) {
                                        System.out.print((i + 1) + " ");
                                    }
                                }
                                System.out.println("de diciembre");

                                dia = scanner.nextInt();
                                scanner.nextLine();

                                if (dia < 1 || dia > 31) {
                                    System.out.println("El día debe ser entre 1 y 31");
                                }

                            } while (dia < 1 || dia > 31);
                            listaEvetos.ListarEventosPorDia(eventos, dia);
                        } else {
                            System.out.println("No hay eventos registrados");
                        }

                        break;
                    case 5:
                        System.exit(0);
                        break;
                }
                System.out.println("------------------------------------------------------");
                System.out.println("------------------------------------------------------");

            } catch (Exception e) {
                System.out.println("hay algun error en lo que escribiste, intentalo de nuevo");
            }
        } while (true);

    }

}
