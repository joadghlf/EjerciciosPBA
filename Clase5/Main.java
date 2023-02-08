/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Clase5;

/**
 *
 * @author jgiuliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Figura[] figuras = new Figura[3];
        
        figuras[0] = new Circulo(44.55);
        figuras[1] = new Rectangulo(30, 40); 
        figuras[2] = new Triangulo(30, 40); 
        
        for (int i = 0; i < figuras.length; i++) {
            figuras[i].calcularArea();
        }
    }
    
}
