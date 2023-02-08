/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase6;

/**
 *
 * @author jgiuliano
 */
public class Oviparo extends Animal{

    public Oviparo(float peso) {
        super(peso);
    }

    
    public void ponerHuevos(){
        System.out.println("Un ovíparo poniendo huevos");
    }
    @Override
    public void comer() {
        System.out.println("Un oviparo comiendo");
    }
    
}
