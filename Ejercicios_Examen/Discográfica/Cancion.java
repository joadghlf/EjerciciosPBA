/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Discográfica;

import java.util.Objects;

/**
 *
 * @author jgiuliano
 */
public class Cancion{
    private String titulo;
    private int duracion;

    public Cancion() {
    }

    public Cancion(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "\nCancion " + "titulo = " + titulo + ", duracion = " + duracion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cancion other = (Cancion) obj;
        if (this.duracion != other.duracion) {
            return false;
        }
        return Objects.equals(this.titulo, other.titulo);
    }
    
    
}
