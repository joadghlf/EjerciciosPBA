/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Biblioteca;

/**
 *
 * @author jgiuliano
 */
public class Libro {
    private int isbn, capitulos;
    private String titulo;
    private boolean estado;

    public Libro() {
    }

    public Libro(int isbn, int capitulos, String titulo, boolean estado) {
        this.isbn = isbn;
        this.capitulos = capitulos;
        this.titulo = titulo;
        this.estado = estado;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String est = "En stock";
        if(estado){
            est = "Prestado";
        }
        return "El libro " + "isbn=" + isbn + ", capitulos=" + capitulos + ", titulo=" + titulo + ", estado= "+est;
    }
    
    
}
