/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Interfaces.Ejercicio6;

/**
 *
 * @author jgiuliano
 */
public class NewMain {

    public static void main(String[] args) {
        
        Student s = new Student("Técnico", new Name("Carlos", "Perez", (char) 55));
        Student s2 = new Student("Orquesta", new Name("Carlos", "Perez", (char) 55));
        
        
        System.out.println(s.compareTo(s2));
    }
    
}
