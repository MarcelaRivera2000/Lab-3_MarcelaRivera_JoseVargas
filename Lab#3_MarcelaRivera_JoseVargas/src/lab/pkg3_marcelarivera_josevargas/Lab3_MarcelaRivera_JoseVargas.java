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
                    equipo();
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
    static double altura;
    static ArrayList<Equipo> equipos = new ArrayList();
    
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
                    double salario = entrada.nextDouble();
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
                    equipos.get(0).getPersonal().add(new Jugadores(camiseta, tiro_de3, defensa, tiro_media, rebote, bandeja, pases, posteo, altura, nombre, apellido, años_P, salario));                    
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void modificar() {
        for (int i = 0; i < equipos.size(); i++) {
            System.out.println("\n**********************************\nEquipo " + i + ": " + equipos.get(i) + "\n**********************************\n");
        }
        System.out.println("Ingrese la posicion del equipo que desea modificar: ");
        int posi = entrada.nextInt();
        System.out.println("\n1.Modificar un jugador\n2.Modificar un medico\n3.Modificar un dueño\n4.Modificar un Entrenador\n");
        int op = entrada.nextInt();
        switch (op) {
            case 1:
                for (int i = 0; i < equipos.get(posi).getPersonal().size(); i++) {
                    if ((equipos.get(posi).getPersonal().get(i)) instanceof Jugadores) {
                        System.out.println("\n**********************************\nJugadores " + i + ": " + equipos.get(i).getPersonal().get(i) + "\n**********************************\n"); 
                    }
                }
        System.out.println("Ingrese la posicion del jugador que desea modificar: ");
        int opp=entrada.nextInt();
                System.out.println("1.Modificar Nombre\n2.Modificar Apellido\n3.Modificar Años como Profesional\n4.Salario\n5.Modificar Numero de Camiseta\n6.Modificar Tiro de 3\n7.Modificar Defensa\n8.Modificar Tiro de Media\n9.Modificar Rebote\n10.Modificar Bandeja\n11.Modificar Pases\n12.Modificar Posteo\n");
                int oppp=entrada.nextInt();
                switch(oppp){
                    case 1:
                        System.out.println("Ingrese el nuevo nombre: ");
                        String n=entrada.next();
                        equipos.get(posi).getPersonal().get(opp).setNombre(n);
                        break;
                    case 2:
                         System.out.println("Ingrese el nuevo Apellido: ");
                        String a=entrada.next();
                        equipos.get(posi).getPersonal().get(opp).setNombre(a);
                        break;
                    case 3:
                         System.out.println("Ingrese Años como Profesional: ");
                        int an=entrada.nextInt();
                        equipos.get(posi).getPersonal().get(opp).setAños_P(an);
                        break;
                    case 4:
                         System.out.println("Ingrese el nuevo salario: ");
                        double aan=entrada.nextDouble();
                        equipos.get(posi).getPersonal().get(opp).setSalario(aan);
                        break;
                    case 5:
                         System.out.println("Ingrese el nuevo Numero de Camiseta: ");
                        int ann=entrada.nextInt();
                        ((Jugadores)equipos.get(posi).getPersonal().get(opp)).setCamiseta(ann);
                        break;
                    case 6:
                         System.out.println("Ingrese el nuevo Tiro de 3: ");
                        int annn=entrada.nextInt();
                        ((Jugadores)equipos.get(posi).getPersonal().get(opp)).setTiro_de3(annn);
                        break;
                    case 7:
                         System.out.println("Ingrese el nuevo Defensa: ");
                        int annnn=entrada.nextInt();
                        ((Jugadores)equipos.get(posi).getPersonal().get(opp)).setDefensa(annnn);
                        break;
                    case 8:
                        System.out.println("Ingrese el nuevo Defensa: ");
                        int annnnn=entrada.nextInt();
                        ((Jugadores)equipos.get(posi).getPersonal().get(opp)).setDefensa(annnnn);
                        break;
                    case 9:
                        System.out.println("Ingrese el nuevo Tiro de medio: ");
                        int annnnnn=entrada.nextInt();
                        ((Jugadores)equipos.get(posi).getPersonal().get(opp)).setTiro_media(annnnnn);
                        break;
                    case 10:
                        System.out.println("Ingrese el nuevo rebote: ");
                        int annnnnnn=entrada.nextInt();
                        ((Jugadores)equipos.get(posi).getPersonal().get(opp)).setRebote(annnnnnn);
                        break;
                    case 11:
                        System.out.println("Ingrese el nuevo bandeja: ");
                        int annnnnnnn=entrada.nextInt();
                        ((Jugadores)equipos.get(posi).getPersonal().get(opp)).setBandeja(annnnnnnn);
                        break;
                    case 12:
                        System.out.println("Ingrese el nuevo pases: ");
                        int annnnnnnnn=entrada.nextInt();
                        ((Jugadores)equipos.get(posi).getPersonal().get(opp)).setPases(annnnnnnnn);
                        break;
                    case 13:
                        System.out.println("Ingrese el nuevo posteo: ");
                        int annnnnnnnnn=entrada.nextInt();
                        ((Jugadores)equipos.get(posi).getPersonal().get(opp)).setPosteo(annnnnnnnnn);
                        break;       
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            
        }
        
    }
    

}
