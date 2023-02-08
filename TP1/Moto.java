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
public class Moto extends Vehiculo{
    private boolean tieneEspejosOk;

    public Moto() {
    }

    public Moto(boolean tieneEspejosOk) {
        this.tieneEspejosOk = tieneEspejosOk;
    }

    public Moto(boolean tieneEspejosOk, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.tieneEspejosOk = tieneEspejosOk;
    }
    
    
    
    public void setMoto(Scanner scan){
        super.setVehiculo(scan);
        System.out.print("La moto cuenta con todos los espejos? ingrese si o no: ");
        if(scan.next().equals("si")){
            this.tieneEspejosOk = true;
        }else{
            this.tieneEspejosOk = false;
        }
    }
}
