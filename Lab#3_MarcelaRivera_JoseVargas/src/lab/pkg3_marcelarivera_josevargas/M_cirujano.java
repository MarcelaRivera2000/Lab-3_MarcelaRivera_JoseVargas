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
public class M_cirujano extends Medicos {
    private int n_cirujias;

    public M_cirujano() {
    }

    public M_cirujano(int n_cirujias) {
        this.n_cirujias = n_cirujias;
    }

    public M_cirujano(int n_cirujias, String colegio, String tipo, String nombre, String apellido, int años_P, double salario) {
        super(colegio, tipo, nombre, apellido, años_P, salario);
        this.n_cirujias = n_cirujias;
    }

    public int getN_cirujias() {
        return n_cirujias;
    }

    public void setN_cirujias(int n_cirujias) {
        this.n_cirujias = n_cirujias;
    }

    @Override
    public String toString() {
        return "M_cirujano{" + "n_cirujias=" + n_cirujias + '}';
    }
    
    
}
