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
public class Vehiculo {
    private String patente, marca;
    private int cilindrada;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, int cilindrada) {
        this.patente = patente;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }
    
    public void setVehiculo(Scanner scan){
        System.out.print("Ingrese la patente del vehículo: ");
        this.patente = scan.next();
        System.out.print("Ingrese la marca del vehículo: ");
        this.marca = scan.next();
        System.out.print("Ingrese la cilindrada del vehículo: ");
        this.cilindrada = scan.nextInt();
    }

    @Override
    public String toString() {
        return "Vehiculo:" + "patente=" + patente + ", marca=" + marca + ", cilindrada=" + cilindrada;
    }
    
    
}
