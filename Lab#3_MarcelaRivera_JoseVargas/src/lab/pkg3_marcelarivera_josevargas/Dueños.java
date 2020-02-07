/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_marcelarivera_josevargas;

/**
 *
 * @author Mvrivera
 */
public class Dueños extends Persona{
    private String cuidad;
    private double netWorth;

    public Dueños() {
    }

    public Dueños(String cuidad, double netWorth, String nombre, String apellido, int años_P, double salario) {
        super(nombre, apellido, años_P, salario);
        this.cuidad = cuidad;
        this.netWorth = netWorth;
    }

   

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    @Override
    public String toString() {
        return "Due\u00f1os{" + "netWorth=" + netWorth + ", cuidad=" + cuidad + '}';
    }
    
    
    
}
