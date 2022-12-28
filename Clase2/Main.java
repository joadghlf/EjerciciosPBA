/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Clase2;

/**
 *
 * @author jgiuliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad = 40;
        int sueldo = 5000;
        
        
        
        Empleado empleado1 = new Empleado("Fernando","Ureña",23,45000);
        Empleado empleado2 = new Empleado("Adrián","López",50,70000);
        empleado1.redefineSueldo(edad, sueldo);
        empleado2.redefineSueldo(edad, sueldo);
        
        
        
        System.out.println(empleado1);
        System.out.println(empleado2);
    }
    
}
