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
public class Entrenadores extends Persona{
    private String fue_jugador;
    private String jugadafav;

    public Entrenadores() {
    }

    public Entrenadores(String fue_jugador, String jugadafav, String nombre, String apellido, int años_P, double salario) {
        super(nombre, apellido, años_P, salario);
        this.fue_jugador = fue_jugador;
        this.jugadafav = jugadafav;
    }

    public String getFue_jugador() {
        return fue_jugador;
    }

    public void setFue_jugador(String fue_jugador) {
        this.fue_jugador = fue_jugador;
    }

    public String getJugadafav() {
        return jugadafav;
    }

    public void setJugadafav(String jugadafav) {
        this.jugadafav = jugadafav;
    }

    @Override
    public String toString() {
        return "Entrenadores{" + "fue_jugador=" + fue_jugador + ", jugadafav=" + jugadafav + '}';
    }
    
    
    
}
