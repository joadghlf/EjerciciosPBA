/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.TP1;

import java.util.Scanner;

/**
 *
 * @author jgiuliano
 */
public class Circuito {
    private int segundos, cantFaltas;

    public Circuito() {
    }

    public Circuito(int segundos, int cantFaltas) {
        this.segundos = segundos;
        this.cantFaltas = cantFaltas;
    }

    
    public int getSegundos() {
        return segundos;
    }

    public int getCantFaltas() {
        return cantFaltas;
    }    
    
    public void setCircuito(Scanner scan){
         System.out.print("Ingrese la cantidad de segundos que tomó el circuito: ");
         this.segundos = scan.nextInt();
         System.out.print("Ingrese la cantidad de faltas cometidas en el circuito: ");
         this.cantFaltas = scan.nextInt();
    }
}
