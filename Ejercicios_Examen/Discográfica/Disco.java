/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Discográfica;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author jgiuliano
 */
public class Disco {
    private String titulo;
    private LocalDate anioEdicion;
    private Set<Cancion> canciones = new HashSet();
    private Musico musico;

    public Disco() {
    }

    public Disco(String titulo, LocalDate anioEdicion, Musico musico) {
        this.titulo = titulo;
        this.anioEdicion = anioEdicion;
        this.musico = musico;
    }
    
    public void agregarCancion(Cancion c){
        boolean flag = true;
        if(!canciones.contains(c)){
        Iterator<Cancion> it = canciones.iterator();
            while (it.hasNext() && flag) {
               if(it.next().equals(c)){
                   flag = false;
               }              
            }
           if(flag){               
        canciones.add(c);
           }
        }
    }
    
    public void eliminarCancion(String titulo){
        Iterator<Cancion> it = canciones.iterator();
        while (it.hasNext()) {
            if(it.next().getTitulo().equals(titulo)){
                it.remove();
            }            
        }
    }
    
    public int duracion(){
        int duracionTotal = 0;
        for (Cancion cancion : canciones) {
            duracionTotal += cancion.getDuracion();
        }
        return duracionTotal;
    }

    @Override
    public String toString() {
        return "Disco" + "\n titulo=" + titulo + "\n anioEdicion = " + anioEdicion + "\n canciones = " + canciones + "\n musico = " + musico;
    }
    
    
}
