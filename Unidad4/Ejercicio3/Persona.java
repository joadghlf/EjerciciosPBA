/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Unidad4.Ejercicio3;

import java.util.Collection;

/**
 *
 * @author jgiuliano
 */
public class Persona implements Comparable<Persona>{
    private String nombre, apellido;
    private int dni;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public int compareTo(Persona p) {
        if(this.apellido.compareTo(p.apellido) ==0){
            if(this.nombre.compareTo(p.nombre)==0){
                if(this.dni == p.dni){
                    return 0;
                }else{
                    if(this.dni>0){
                        return 1;
                    }
                }
            }else{
                return this.nombre.compareTo(p.nombre);
            }
        }else{
            return this.apellido.compareTo(p.apellido);
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Persona: " + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni+"\n";
    }
    
    
}
