/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Interfaces.Ejercicio1;

import java.util.Random;

/**
 *
 * @author jgiuliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Clase01 c = new Clase01();
        
        c.setA("000000000000");
        c.setB("000000000000");
        c.setC("000000000000");
        c.setD("000000000000");
           
        try {
             Clase01 c1 = (Clase01) c.clone();
             c1.setA("111111111111");
             Clase01 c2 = (Clase01) c.clone();
             c2.setB("111111111111");
             Clase01 c3 = (Clase01) c.clone();
             c3.setC("111111111111");
             Clase01 c4 = (Clase01) c.clone();
             c4.setD("111111111111");
             
             c.concAtributos();
             c1.concAtributos();
             c2.concAtributos();
             c3.concAtributos();
             c4.concAtributos();
        } catch (Exception e) {
        }
                
    }
    
}
