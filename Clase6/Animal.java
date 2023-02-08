/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase6;

/**
 *
 * @author jgiuliano
 */
public abstract class Animal {
    protected float peso;

    public Animal(float peso) {
        this.peso = peso;
    }
    
    public abstract void comer();
}
