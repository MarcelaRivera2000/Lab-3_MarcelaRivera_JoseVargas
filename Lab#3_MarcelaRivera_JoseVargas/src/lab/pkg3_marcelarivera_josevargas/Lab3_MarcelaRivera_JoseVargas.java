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
static int cont_global = 0;
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
                    equipo();
                    cont_global++;
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
    static String nombre_equipo, ciudad;
    static int año_fundacion, campeonatos, camiseta;
    static  double altura, netWorth;
    static ArrayList<Equipo> equipos=new ArrayList();
    
    public static void equipo() {
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
                    + "5] Salir");
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
                    System.out.println("Ingrese el salario:");
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
                    equipos.get(cont_global).getPersonal().add(new Jugadores(camiseta, tiro_de3, defensa, tiro_media, rebote, bandeja, pases, posteo, altura, nombre, apellido, años_P,salario));
                    System.out.println("Jugador agregado con exito!");
                    System.out.println();
                    break;
                case 2:
                    contt++;
                    System.out.println("Ingrese el colegio donde estudio: ");
                    String colegio = entrada.next();
                    System.out.println("Ingrese el salario del medico: ");
                    double salariomed = entrada.nextDouble();
                    System.out.println("Ingrese la labor del medico:\n"
                            + "1] Medico General\n"
                            + "2] Cirujano\n"
                            + "3] Terapeuta");
                    int opcionmedico = entrada.nextInt();
                    String tipo = "";
                    switch(opcionmedico){
                        case 1:
                           tipo = "Medico General";
                           break;
                        case 2:
                           tipo = "Cirujano";
                           break;
                        case 3:
                           tipo = "Terapeuta";
                           break;
                    }
                    equipos.get(cont_global).getPersonal().add(new Medicos(colegio, tipo, nombre, apellido, años_P, salariomed));
                    System.out.println("Medico agregado con exito!");
                    System.out.println();
                    break;
                case 3:
                    conttt++;
                    System.out.println("Ingrese el NetWorth del dueño: ");
                    netWorth = entrada.nextDouble();
                    System.out.println("Ingrese la ciudad donde nacio: ");
                    ciudad = entrada.next();
                    System.out.println("Ingrese el salario: ");
                    double salariodueño = entrada.nextInt();
                    equipos.get(cont_global).getPersonal().add((new Dueños(ciudad, netWorth, nombre, apellido, años_P, salariodueño)));
                    System.out.println("Dueño agregado con exito!");
                    System.out.println();
                    break;
                case 4:
                    contttt++;
                    System.out.println("Fue jugador en el pasado?: ");
                    String fue_jugador = entrada.next();
                    System.out.println("Jugada favorita: ");
                    String jugadafav = entrada.next();
                    System.out.println("Ingrese su puesto: \n"
                            + "1] Entrenador Principal\n"
                            + "2] Asistente de Entrenador\n"
                            + "3] Preparador Fisico");
                    int puesto = entrada.nextInt();
                    double sueldoent = entrada.nextDouble();
                    switch(puesto){
                        case 1:
                            sueldoent = 2000000;
                            break;
                        case 2:
                            sueldoent = 1000000;
                            break;
                        case 3:
                            sueldoent = 800000;
                            break;
                    }
                    System.out.println("Entrenador agregado con exito!");
                    System.out.println();
                    break;
                case 5:
                    if (cont >= 5 && contt >= 3 && conttt >= 1 && contttt >= 3) {
                        System.out.println("EQUIPO CREADO");
                        break;
                    } else {
                        System.out.println("Su equipo aun no esta completo");
                    }
                    System.out.println();
                    break;

            }
        }
    }
}
