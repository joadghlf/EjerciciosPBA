/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase6;

/**
 *
 * @author jgiuliano
 */
public class Perro extends Mamifero{
     
    private String colorPelo;

    public Perro(String colorPelo, boolean sangreCaliente, float peso) {
        super(sangreCaliente, peso);
        this.colorPelo = colorPelo;
    }
    
    public void ladrar(){
         System.out.println("Un Perro ladrando");
    }
    
}
