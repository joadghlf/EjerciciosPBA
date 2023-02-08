/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Clase13;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author jgiuliano
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        Random rm = new Random();
        while (numeros.size() < 20 ) {
           numeros.add(rm.nextInt(99));  
        }
        
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
    
}
