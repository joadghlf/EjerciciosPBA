/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Unidad4.Ejercicio2;

/**
 *
 * @author jgiuliano
 */
public class Rectangulo extends Figura{
    private double alto, largo;

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return alto*largo;
    }
    
    
}
