/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_marcelarivera_josevargas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mvrivera
 */
public class Lab3_MarcelaRivera_JoseVargas {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("-----NBA-----");
            System.out.println("1] Crear Un Equipo");
            System.out.println("2] Simular Partida");
            System.out.println("Ingrese una opcion: ");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    equipos.add(new Equipo(nombre_equipo, año_fundacion, campeonatos));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                    
            }

        }
    }
    static String nombre_equipo;
    static int año_fundacion, campeonatos, camiseta;
    static  double altura;
    static ArrayList<Equipo> equipos=new ArrayList();
    
    public void equipo() {
        System.out.println("Ingrese el nombre de su equipo: ");
        nombre_equipo = entrada.next();
        System.out.println("Ingrese el año de fundacion: ");
        año_fundacion = entrada.nextInt();
        System.out.println("Ingrese  el numero de campeonatos: ");
        campeonatos = entrada.nextInt();
        int cont = 0;
        int contt = 0;
        int conttt = 0;
        int contttt = 0;
        while (true) {
            System.out.println("---Personal del Equipo---");
            System.out.println("1] Agregar Jugador\n"
                    + "2] Agregar Medicos\n"
                    + "3] Agregar Dueño\n"
                    + "4] Agregar Entrenadores\n"
                    + "5] salir");
            System.out.println("Ingrese una opcion: ");
            int opcionpersonas = entrada.nextInt();
            System.out.println("Ingrese el nombre: ");
            String nombre = entrada.next();
            System.out.println("Ingrese el apellido: ");
            String apellido = entrada.next();
            System.out.println("Ingrese los años como profesional: ");
            int años_P = entrada.nextInt();
            switch (opcionpersonas) {
                case 1:
                    cont++;
                    System.out.println("Ingrese el numero de camisa: ");
                    int camiseta = entrada.nextInt();
                    System.out.println("Ingrese OVR de tiro de 3: ");
                    int tiro_de3 = entrada.nextInt();
                    System.out.println("Ingrese OVR de defensa: ");
                    int defensa = entrada.nextInt();
                    System.out.println("Ingrese OVR de tiro de media: ");
                    int tiro_media = entrada.nextInt();
                    System.out.println("Ingrese OVR de rebote: ");
                    int rebote = entrada.nextInt();
                    System.out.println("Ingrese OVR de bandeja: ");
                    int bandeja = entrada.nextInt();
                    System.out.println("Ingrese OVR de pases: ");
                    int pases = entrada.nextInt();
                    System.out.println("Ingrese OVR de posteo: ");
                    int posteo = entrada.nextInt();
                    System.out.println("Salario:");
                    double salario=entrada.nextDouble();
                    System.out.println("Ingrese la posicion: \n"
                            + "1] Base\n"
                            + "2] Escolta\n"
                            + "3] Alero\n"
                            + "4] Alero-Pivot\n"
                            + "5] Centro\n");
                    int posicion = entrada.nextInt();
                    switch (posicion) {
                        case 1:
                            altura = 1.93;
                            break;
                        case 2:
                            altura = 2.00;
                            break;
                        case 3:
                            altura = 2.05;
                            break;
                        case 4:
                            altura = 2.10;
                            break;
                        case 5:
                            altura = 2.13;
                            break;
                    }
                    equipos.get(0).getPersonal().get(0).getJugadores().add(new Jugadores(camiseta, tiro_de3, defensa, tiro_media, rebote, bandeja, pases, posteo, altura, nombre, apellido, años_P,salario));
                   
                    break;
                case 2:
                    contt++;
                    break;
                case 3:
                    conttt++;
                    break;
                case 4:
                    contttt++;

                    break;
                case 5:
                    if (cont >= 5 && contt >= 3 && conttt >= 1 && contttt >= 3) {
                        System.out.println("EQUIPO CREADO");
                        break;
                    } else {
                        System.out.println("Su equipo aun no esta completo");
                    }
                    break;

            }
        }
    }
}
