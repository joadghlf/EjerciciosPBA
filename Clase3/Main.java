/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Clase2.Clase3;

/**
 *
 * @author jgiuliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro(true,false,true,2015,6,"Coli","Corder");
        perro.edad();
        perro.perdible();
        perro.adoptable();
        perro.mordio();
        perro.cobrarMulta();
        perro.mordio();
        perro.mordio();
        perro.cobrarMulta();
    }
    
}
