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
public class ExamenAuto extends Examen{

    Circuito circuito1;

    public ExamenAuto() {
        circuito1 = new Circuito();
    }

    public ExamenAuto(Circuito circuito1, int cantidadFaltas, int segundos, LocalDate fecha, Persona persona, Vehiculo vehiculo) {
        super(cantidadFaltas, segundos, fecha, persona, vehiculo);
        this.circuito1 = circuito1;
         if(resultado()){
            this.resultadoExamen = "Aprobado";
        }else{
            this.resultadoExamen = "Reprobado";
        }
    }
    
    @Override
    public void setCircuito(Scanner scan) {
        System.out.print("Ingrese los datos del circuito: ");
        circuito1.setCircuito(scan);
    }

    @Override
    public int cantidadFaltas() {
        return circuito1.getCantFaltas();
    }

    @Override
    public int cantidadSegundos() {
        return circuito1.getSegundos();
    }
    
    @Override
    public boolean resultado(){
        if(this.cantidadFaltas()<3 && this.cantidadSegundos()< 1800){
            return true;
        }
        return false;
    }    
    
}
