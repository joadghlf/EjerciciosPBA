/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Biblioteca;

/**
 *
 * @author jgiuliano
 */
public class Docente extends Cliente{

    private int legajo;

    public Docente() {
    }

    public Docente(int legajo, int dni, int librosPrestados, String nombres, String apellido) {
        super(dni, librosPrestados, nombres, apellido);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    
    @Override
    public boolean pedirLibroPrestado() {
        return true;
    }
    
}
