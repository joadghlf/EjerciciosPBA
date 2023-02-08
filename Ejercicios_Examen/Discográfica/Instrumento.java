/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Discográfica;

/**
 *
 * @author jgiuliano
 */
public class Instrumento implements Tocable {    
    
    @Override
    public void tocar() {
        System.out.println("Tocar "+getClass().getSimpleName());
    }
    
}
