/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.TP1;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jgiuliano
 */
public class LICONEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Seteamos variables
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        Menu menuConsultas = new Menu();
        Examen[] examenes = new Examen[100];
        //Definimos menús
        setMenus(menu, menuConsultas);
        //Arrancamos menú inicial
        startMenuInicial(scan, menu, menuConsultas, examenes);

    }

    private static void setMenus(Menu menu, Menu menuConsultas) {
        String sMenu = "      LICENCIAS DE CONDUCIOR\n"
                + "          Menú Principal\n"
                + "==================================\n"
                + "   1.- Registrar Examen MOTO\n"
                + "   2.- Registrar Examen AUTO\n"
                + "   3.- Consultas\n"
                + "\n  "
                + "   9.- Cerrar la aplicación \n"
                + "\n"
                + "Ingrese una opción: ";

        menu.setMenu(sMenu);

        sMenu = "      LICENCIAS DE CONDUCIOR\n"
                + "          Menú Consultas\n"
                + "==================================\n"
                + "   1.- Examen por DNI\n"
                + "   2.- Examenes de moto por FECHA\n"
                + "   3.- Examenes de auto por FECHA\n"
                + "   4.- Todos los exámenes\n"
                + "   6.- Carga masiva de información\n"
                + "\n  "
                + "   9.- Volver al menú anterior \n"
                + "\n"
                + "Ingrese una opción: ";
        menuConsultas.setMenu(sMenu);
    }

    private static void startMenuInicial(Scanner scan, Menu menu, Menu menuConsultas, Examen[] examenes) {
        int opcion, tamLogico = 0;
        System.out.print(menu.getMenu());
        opcion = scan.nextInt();
        while (opcion != 9) {
            switch (opcion) {
                case 1:
                    if (tamLogico < 100) {
                        Examen examen = new ExamenMoto();
                        examen.setExamen(scan);
                        examenes[tamLogico] = examen;
                        tamLogico++;
                    } else {
                        System.out.println("Se ha completado la carga de exámenes, sólo se podrán realizar consutlas");
                    }
                    break;
                case 2:
                    if (tamLogico < 100) {
                        Examen examen = new ExamenAuto();
                        examen.setExamen(scan);
                        examenes[tamLogico] = examen;
                        tamLogico++;
                    } else {
                        System.out.println("Se ha completado la carga de exámenes, sólo se podrán realizar consutlas");
                    }
                    break;
                case 3:
                    startMenuConsultas(scan, menuConsultas, examenes, tamLogico);
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.print(menu.getMenu());
            opcion = scan.nextInt();
        }
    }

    private static void startMenuConsultas(Scanner scan, Menu menuConsultas, Examen[] examenes, int tamLogico) {
        int opcion;
        System.out.print(menuConsultas.getMenu());
        opcion = scan.nextInt();
        while (opcion != 9) {
            switch (opcion) {
                case 1:
                    busquedaPorDni(examenes, tamLogico, scan);
                    break;
                case 2:
                    examenPorFecha(examenes, tamLogico, scan, "Moto");
                    break;
                case 3:
                    examenPorFecha(examenes, tamLogico, scan, "Auto");
                    break;
                case 4:
                    imprimirTodosLosExamenes(examenes, tamLogico);
                    break;
                case 6:
                    cargaMasivaInformacion(examenes, tamLogico);
                    tamLogico += 50;
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.print(menuConsultas.getMenu());
            opcion = scan.nextInt();
        }
    }

    private static void cargaMasivaInformacion(Examen[] examenes, int tamLogico) {
        Random rm = new Random();
        String[] nombres = new String[]{"Gonzalo", "Manuel", "Laura", "Jimena", "Eve", "Alma", "Carolina", "Lucía", "Pedro", "Nacho"};
        String[] apellidos = new String[]{"Gomez", "González", "Quintana", "Sittner", "Giuliano", "Perez", "Kantata", "Chin", "Morango", "Nitche"};
        String[] marca = new String[]{"Honda", "Rouser", "Renault", "Chrebrolet", "Hundai"};
        for (int i = 0; i < 25; i++) {
            String date = (1950 + rm.nextInt(2023 - 1950) + "-0" + (1 + rm.nextInt(8)) + "-1" + (1 + rm.nextInt(8)));
            String fecha = (1950 + rm.nextInt(2023 - 1950) + "-0" + (1 + rm.nextInt(8)) + "-1" + (1 + rm.nextInt(8)));
            LocalDate ld = LocalDate.parse(date);
            Persona persona = new Persona((1 + rm.nextInt(99999999)), ld, nombres[rm.nextInt(9)], apellidos[rm.nextInt(9)]);
            Vehiculo moto = new Moto(true, String.valueOf(rm.nextInt(9) + rm.nextInt(9) + rm.nextInt(9)), String.valueOf(rm.nextInt(4)), 50 + rm.nextInt(300 + 50));
            Examen em = new ExamenMoto(new Circuito(rm.nextInt(150) * 10, rm.nextInt(5)), new Circuito(rm.nextInt(150) * 10, rm.nextInt(5)), rm.nextInt(5), rm.nextInt(150) * 10, LocalDate.parse(fecha), persona, moto);
            examenes[tamLogico] = em;
            tamLogico++;
        }
        for (int i = 0; i < 25; i++) {
            String date = (1950 + rm.nextInt(2023 - 1950) + "-0" + (1 + rm.nextInt(8)) + "-1" + (1 + rm.nextInt(8)));
            String fecha = (1950 + rm.nextInt(2023 - 1950) + "-0" + (1 + rm.nextInt(8)) + "-1" + (1 + rm.nextInt(8)));
            LocalDate ld = LocalDate.parse(date);
            Persona persona = new Persona((1 + rm.nextInt(99999999)), ld, nombres[rm.nextInt(9)], apellidos[rm.nextInt(9)]);
            Vehiculo auto = new Auto(rm.nextInt(4), String.valueOf(rm.nextInt(9) + rm.nextInt(9) + rm.nextInt(9)), String.valueOf(rm.nextInt(4)), 50 + rm.nextInt(300 + 50));
            Examen em = new ExamenAuto(new Circuito(rm.nextInt(150) * 10, rm.nextInt(5)), rm.nextInt(5), rm.nextInt(150) * 10, LocalDate.parse(fecha), persona, auto);
            examenes[tamLogico] = em;
            tamLogico++;
        }
    }

    private static void busquedaPorDni(Examen[] examenes, int tamLogico, Scanner scan) {
        int cont = 0, flag = 0;
        int dni;
        System.out.print("Ingrese el dni de la persona: ");
        dni = scan.nextInt();
        while (cont < tamLogico && flag == 0) {
            if (examenes[cont].busquedaPorDni(cont)) {
                System.out.println("La persona con dni " + dni + " nombre " + examenes[cont].getPersona().getNombre() + " " + examenes[cont].getPersona().getApellido());
                System.out.println("Tuvo un tiempo de: " + (examenes[cont].getSegundos() / 60) + " y una cantidad de faltas de " + examenes[cont].getCantidadFaltas());
                flag = 1;
            }
            if (flag == 1) {
                System.out.println();
            }
        }

    }

    private static void imprimirTodosLosExamenes(Examen[] examenes, int tamLogico) {
        for (int i = 0; i < tamLogico; i++) {
            System.out.println(examenes[i].toString());
        }
    }

    private static void examenPorFecha(Examen[] examenes, int tamLogico, Scanner scan, String vehiculo) {
        System.out.println("Ingrese una fecha de consulta: ");
        LocalDate date = LocalDate.parse(scan.next());
        for (int i = 0; i < tamLogico; i++) {
            if(examenes[i].getVehiculo().getClass().getSimpleName().equals(vehiculo)){
                if(date.equals(examenes[i].getFecha())){
                System.out.println("DNI: "+examenes[i].getPersona().getDni()+" Resultado: "+examenes[i].resultadoExamen);
            } 
            }           
        }
    }

}
