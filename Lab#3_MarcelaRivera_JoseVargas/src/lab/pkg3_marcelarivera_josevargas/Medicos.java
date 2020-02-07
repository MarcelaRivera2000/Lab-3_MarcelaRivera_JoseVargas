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
public class Medicos extends Persona {
    private String colegio,tipo;

    public Medicos() {
    }

    
    public Medicos(String colegio, String tipo, String nombre, String apellido, int años_P, double salario) {
        super(nombre, apellido, años_P, salario);
        this.colegio = colegio;
        this.tipo = tipo;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Medicos{" + "colegio=" + colegio + ", tipo=" + tipo + '}';
    }
    
}
