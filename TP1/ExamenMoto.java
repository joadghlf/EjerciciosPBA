/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.TP1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author jgiuliano
 */
public class ExamenMoto extends Examen{

    Circuito circuito1, circuito2;

    public ExamenMoto() {        
        circuito1 = new Circuito();
        circuito2 = new Circuito();
    }

    public ExamenMoto(Circuito circuito1, Circuito circuito2, int cantidadFaltas, int segundos, LocalDate fecha, Persona persona, Vehiculo vehiculo) {
        super(cantidadFaltas, segundos, fecha, persona, vehiculo);
        this.circuito1 = circuito1;
        this.circuito2 = circuito2;
         if(resultado()){
            this.resultadoExamen = "Aprobado";
        }else{
            this.resultadoExamen = "Reprobado";
        }
    }
    
    

    @Override
    public void setCircuito(Scanner scan) {
        System.out.println("Ingrese los datos del primer circuito: ");
        circuito1.setCircuito(scan);
         System.out.println("Ingrese los datos del segundo circuito: ");
        circuito2.setCircuito(scan);
    }

    @Override
    public int cantidadFaltas() {
        return circuito1.getCantFaltas()+circuito2.getCantFaltas();
    }

    @Override
    public int cantidadSegundos() {
        return (circuito1.getSegundos()+circuito2.getSegundos())/2;
    }
    
    @Override
    public boolean resultado(){
        if(this.cantidadFaltas()<5 && this.cantidadSegundos()< 1200){
            return true;
        }
        return false;
    }    
    
}
