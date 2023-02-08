/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase6;

/**
 *
 * @author jgiuliano
 */
public class Mamifero extends Animal {

    private boolean sangreCaliente;

    public Mamifero(boolean sangreCaliente, float peso) {
        super(peso);
        this.sangreCaliente = sangreCaliente;
    }    
    
    @Override
    public void comer() {
        System.out.println("Un mamífero comiendo");
    }
    
    public void amamantar(){
        System.out.println("Un mamífero amamantando");
    }
    
    public void parir(){
         System.out.println("Un mamífero pariendos");
    }
}
