/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Unidad4.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jgiuliano
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<Figura> figuras = new ArrayList();
       double areaTotal = 0;
       figuras.add(new Circulo(2));
       figuras.add(new Rectangulo(3, 2));
       figuras.add(new Triangulo(4, 2));
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        
      System.out.println("El area total es: "+areaTotal);
       
    }
    
}
