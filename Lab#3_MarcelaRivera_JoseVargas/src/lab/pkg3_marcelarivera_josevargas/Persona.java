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

    public Persona() {
    }

    public Persona(String nombre, String apellido, int años_P, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.años_P = años_P;
        this.salario = salario;
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
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", a\u00f1os_P=" + años_P + ", salario=" + salario ;
    }

   
    
    
}
