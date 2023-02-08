/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Discográfica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jgiuliano
 */
public class Banda extends Musico{
    private String titulo;
    private List<Musico> musicos = new ArrayList();

    public Banda(String titulo, String genero, String discografica, LocalDate anioInicio) {
        super(genero, discografica, anioInicio);
        this.titulo = titulo;
    }

    public Banda() {
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void addMusico(Musico m){
        musicos.add(m);
    }

    @Override
    public String toString() {
        return "Banda: " + "titulo =" + titulo + ", musicos=" + musicos;
    }
    
    
    
}
