/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Unidad4.Ejercicio2;

/**
 *
 * @author jgiuliano
 */
public class Circulo extends Figura{
    private double radio;
    private final double PI = 3.1456;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea() {
        return radio*radio*PI;
    }
    
    
    
}
