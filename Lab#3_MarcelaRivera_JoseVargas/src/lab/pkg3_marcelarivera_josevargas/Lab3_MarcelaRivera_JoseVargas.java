/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_marcelarivera_josevargas;

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
        while(true){
            System.out.println("-----NBA-----");
            System.out.println("1] Crear Un Equipo");
            System.out.println("2] Simular Partida");
            int opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre de su equipo: ");
                    String nombre = entrada.next();
                    System.out.println("Ingrese el año de fundacion: ");
                    int año_fundacion = entrada.nextInt();
                    System.out.println("Ingrese  el numero de campeonatos: ");
                    int campeonatos = entrada.nextInt();
                    while(true){
                        System.out.println("---Personal del Equipo---");
                        System.out.println("1] Agregar Jugador\n"
                                + "2] ");
                        
                    }      
            }
        }
       
    }
    
}
