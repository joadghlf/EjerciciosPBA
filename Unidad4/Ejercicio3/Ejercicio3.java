/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Unidad4.Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jgiuliano
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList();
       personas.add(new Persona("Carlos", "Perez", 123));
       personas.add(new Persona("Carlitos", "Perez", 123));
       personas.add(new Persona("Carlos", "Perex", 123));
       personas.add(new Persona("Carlos", "Perez", 1234));
        
        Collections.sort(personas);
        System.out.println(personas.toString());
        
    }
    
}
