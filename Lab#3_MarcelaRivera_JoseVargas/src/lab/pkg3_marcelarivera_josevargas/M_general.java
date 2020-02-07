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
public class M_general extends Medicos{
    private int n_enfermedades;

    public M_general() {
    }

    public M_general(int n_enfermedades) {
        this.n_enfermedades = n_enfermedades;
    }

    public M_general(int n_enfermedades, String colegio, String tipo, String nombre, String apellido, int años_P, double salario) {
        super(colegio, tipo, nombre, apellido, años_P, salario);
        this.n_enfermedades = n_enfermedades;
    }

    
    public int getN_enfermedades() {
        return n_enfermedades;
    }

    public void setN_enfermedades(int n_enfermedades) {
        this.n_enfermedades = n_enfermedades;
    }

    @Override
    public String toString() {
        return "M_general{" + "n_enfermedades=" + n_enfermedades + '}';
    }
    
    
}
