
package PBAREVIEW.Ejercicios_Examen.Biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class Cliente {
    protected int dni;
    protected String nombres, apellido;
    protected Set<Libro> librosPrestados = new HashSet<>();
    
    public Cliente() {
    }

    
    public Cliente(int dni, int librosPrestados, String nombres, String apellido) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void tomarLibro(Libro l){
        librosPrestados.add(l);
    }
    
    public void devolverLibro(Libro l){
        Iterator<Libro> it = librosPrestados.iterator();
        while (it.hasNext()) {
            Libro nextLibro = it.next();
            if(nextLibro.getTitulo().equals(l.getTitulo())){
                librosPrestados.remove(nextLibro);
            }
        }
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public abstract boolean pedirLibroPrestado();
    
}
