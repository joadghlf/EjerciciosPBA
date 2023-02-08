/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Interfaces.Ejercicio5;

/**
 *
 * @author jgiuliano
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4};
        int[] b = new int[]{-1,2,-3,4,-5,4,9};
        MyArray m1 = new MyArray(a);
        MyArray m2 = new MyArray(b);
        
        System.out.println(m1.compareTo(m2));
    }
    
}
