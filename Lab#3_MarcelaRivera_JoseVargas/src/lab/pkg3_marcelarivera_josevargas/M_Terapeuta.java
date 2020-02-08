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
public class M_Terapeuta extends Medicos {
    private int n_terapias;

    public M_Terapeuta() {
    }

    public M_Terapeuta(int n_terapias, String colegio, String tipo, String nombre, String apellido, int años_P, double salario) {
        super(colegio, tipo, nombre, apellido, años_P, salario);
    }
    
    

    public int getN_terapias() {
        return n_terapias;
    }

    public void setN_terapias(int n_terapias) {
        this.n_terapias = n_terapias;
    }

    @Override
    public String toString() {
        return "M_Terapeuta{" + "n_terapias=" + n_terapias + '}';
    }

  
    
    
}
