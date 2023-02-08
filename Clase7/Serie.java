/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase7;

/**
 *
 * @author jgiuliano
 */
public class Serie  extends Video{
    
   private int temporadas;

    public Serie(int temporadas, String titulo, String genero, int duracion, boolean visto) {
        super(titulo, genero, duracion, visto);
        this.temporadas = temporadas;
    }
   
       
    public void cambiarVisto(){
        this.visto = true;
    }  
   
}
