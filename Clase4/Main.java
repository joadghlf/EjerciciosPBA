/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Clase4;

import java.util.Scanner;

/**
 *
 * @author jgiuliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minima;
        Password[] passwords;
        System.out.println("Ingrese la cantidad de passwords que serán solicitados");
        passwords = new Password[scan.nextInt()];
        Password pass;
        
             System.out.println("Ingrese la longitud mínima");
             minima = scan.nextInt();
        for (int i = 0; i < passwords.length; i++) {
            System.out.println("Ingrese una cadena");
            scan.nextLine();
            pass = new Password(scan.nextLine());
            while (pass.getLongitud() < minima){                
               System.out.println("La cadena ingresada es menor de la longitud mínima. \n Ingrese una nueva cadena");
               pass = new Password(scan.nextLine());
            }
             if(pass.esFuerte()){
            System.out.println("El password es fuerte");
        }else{
            System.out.println("El password es debil");
        }
        }
       
        
       
    }
    
}
