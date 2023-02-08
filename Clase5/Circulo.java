/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase5;

/**
 *
 * @author jgiuliano
 */
public class Circulo extends Figura{

    private final double pi = Math.PI;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    protected void calcularArea() {
        System.out.println("El área es: "+(this.radio*this.radio)*pi);
    }
    
}
