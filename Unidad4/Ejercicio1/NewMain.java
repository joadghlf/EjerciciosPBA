/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Unidad4.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jgiuliano
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<Integer> array = new ArrayList();
       Random r = new Random();
        for (int i = 0; i < 10; i++) {
           array.add(r.nextInt(20)); 
        }
       
        System.out.println(array.toString());
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
            int val = array.get(i) * array.get(i);
            array.set(i, val);
        }
        Iterator <Integer> it = array.iterator();
        
        while (it.hasNext()) {
            if(it.next()>100){
                it.remove();
            }
        }
        
        Collections.sort(array);
        
        System.out.println(array.toString());
       
               
    }
    
}
