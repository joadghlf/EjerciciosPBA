/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Unidad4.Ejercicio4;

/**
 *
 * @author jgiuliano
 */
public class Jugador {
    private String nombre, posicion;
    private int goles, partidosJutados;

    public Jugador(String nombre, String posicion, int partidosJutados, int goles) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.goles = goles;
        this.partidosJutados = partidosJutados;
    }

    public String getNombre() {
        return nombre;
    }    
    
    
    private double promedioGoles(){
        if(this.goles ==0){
            return 0;
        }else{
            return (double) this.partidosJutados/this.goles;
        }
    }
    
    public boolean isTitular(){
        if(this.posicion=="A"){
            return (this.promedioGoles()>2.5);
        }else{
            return (this.promedioGoles()>1.5);
        }        
    }

    @Override
    public String toString() {
        return "Jugador:" + "nombre=" + nombre + ", posicion=" + posicion + ", goles=" + goles + ", partidosJutados=" + partidosJutados + '}';
    }
    
    
}
