/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase5;

/**
 *
 * @author jgiuliano
 */
public class Triangulo extends Figura{
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
        
    
    @Override
    protected void calcularArea() {
        System.out.println("El área es: "+((this.base*this.altura)/2));
    }
    
}
