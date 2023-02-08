/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Clase14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
        List<String> lista = new ArrayList<>();
        agregarNombres(lista);
        System.out.println(lista);
        eliminarRepetidos(lista);
        System.out.println(lista);
    }

    private static void agregarNombres(List<String> lista) {
       lista.add("Pablo");
       lista.add("Carlos");
       lista.add("Pablo");
       lista.add("Alejandra");
       lista.add("Laura");
       lista.add("Montana");
       lista.add("Alejandra");
       lista.add("Laura");
    }

    private static void eliminarRepetidos(List<String> lista) {
        Set<String> lista2 = new HashSet<>();
        lista2.addAll(lista);
        lista.removeAll(lista);
        lista.addAll(lista2);
    }
    
}
