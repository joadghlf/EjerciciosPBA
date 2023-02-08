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
public class Auto extends Vehiculo{
    private int cantPuertas;

    public Auto() {
    }

    public Auto(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public Auto(int cantPuertas, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.cantPuertas = cantPuertas;
    }
    
    public void setAuto(Scanner scan){
        super.setVehiculo(scan);
        System.out.print("Ingrese la cantidad de puertas del vehículo: ");
        this.cantPuertas = scan.nextInt();
    }
    
}
