/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Discográfica;

import java.time.LocalDate;

/**
 *
 * @author jgiuliano
 */
public class Musico {
   protected String genero, discografica;
   protected LocalDate anioInicio;

    public Musico() {
    }

    public Musico(String genero, String discografica, LocalDate anioInicio) {
        this.genero = genero;
        this.discografica = discografica;
        this.anioInicio = anioInicio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    public LocalDate getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(LocalDate anioInicio) {
        this.anioInicio = anioInicio;
    }
   
}
