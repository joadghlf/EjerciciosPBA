/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase7;

/**
 *
 * @author jgiuliano
 */
public abstract class Video {
    protected String titulo, genero;
    protected int duracion;
    protected boolean visto;

    public Video(String titulo, String genero, int duracion, boolean visto) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.visto = visto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
    
    
    public void mayorDuracion(){
        System.out.println("La duración es de: "+this.duracion);
    }
    
    

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", genero=" + genero + ", duracion=" + duracion + ", visto=" + visto + '}';
    }
   
}
