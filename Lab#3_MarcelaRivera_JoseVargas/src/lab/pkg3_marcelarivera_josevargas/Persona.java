/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_marcelarivera_josevargas;

import java.util.ArrayList;

/**
 *
 * @author Mvrivera
 */
public class Persona {
    private String nombre,apellido;
    private int años_P;
    private double salario;
    private ArrayList<Jugadores> jugadores=new ArrayList();
    private ArrayList<Medicos> medicos=new ArrayList();
    private ArrayList<Dueños> dueños=new ArrayList();
    private ArrayList<Entrenadores> entrenadores=new ArrayList();
    public Persona() {
    }

    public Persona(String nombre, String apellido, int años_P, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.años_P = años_P;
        this.salario = salario;
    }
    

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Medicos> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medicos> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Dueños> getDueños() {
        return dueños;
    }

    public void setDueños(ArrayList<Dueños> dueños) {
        this.dueños = dueños;
    }

    public ArrayList<Entrenadores> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(ArrayList<Entrenadores> entrenadores) {
        this.entrenadores = entrenadores;
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAños_P() {
        return años_P;
    }

    public void setAños_P(int años_P) {
        this.años_P = años_P;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", a\u00f1os_P=" + años_P + ", salario=" + salario + ", jugadores=" + jugadores + ", medicos=" + medicos + ", due\u00f1os=" + dueños + ", entrenadores=" + entrenadores + '}';
    }

   
    
    
}
