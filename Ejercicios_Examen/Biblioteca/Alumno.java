/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Biblioteca;

/**
 *
 * @author jgiuliano
 */
public class Alumno extends Cliente{

    private String legajo;

    public Alumno() {
    }

    public Alumno(String legajo) {
        this.legajo = legajo;
    }

    public Alumno(String legajo, int dni, int librosPrestados, String nombres, String apellido) {
        super(dni, librosPrestados, nombres, apellido);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    
    
    
    @Override
    public boolean pedirLibroPrestado() {
        if(this.librosPrestados.size() >= 2){
            return false;
        }else{
            return true;
        }
    }
    
}
