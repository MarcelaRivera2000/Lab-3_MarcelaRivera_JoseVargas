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
public class Equipo {
    private String nombre;
    private int año,campeonatos;
    private ArrayList<Persona> personal=new ArrayList();
    private ArrayList<Jugadas> jugadas=new ArrayList();
    private Dueños due;

    public Equipo() {
    }

    public Equipo(String nombre, int año, int campeonatos, Dueños due) {
        this.nombre = nombre;
        this.año = año;
        this.campeonatos = campeonatos;
        this.due = due;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }

    public ArrayList<Persona> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Persona> personal) {
        this.personal = personal;
    }

    public ArrayList<Jugadas> getJugadas() {
        return jugadas;
    }

    public void setJugadas(ArrayList<Jugadas> jugadas) {
        this.jugadas = jugadas;
    }

    public Dueños getDue() {
        return due;
    }

    public void setDue(Dueños due) {
        this.due = due;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", a\u00f1o=" + año + ", campeonatos=" + campeonatos + ", personal=" + personal + ", jugadas=" + jugadas + ", due=" + due + '}';
    }
    
    
    
    
    
}
