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
public abstract class Examen {
    protected int cantidadFaltas, segundos;
    protected LocalDate fecha; 
    protected Persona persona;
    protected Vehiculo vehiculo;
    protected String resultadoExamen;

    public Examen() {
        persona = new Persona();
        vehiculo = new Vehiculo();
    }

    public Examen(int cantidadFaltas, int segundos, LocalDate fecha, Persona persona, Vehiculo vehiculo) {
        this.cantidadFaltas = cantidadFaltas;
        this.segundos = segundos;
        this.fecha = fecha;
        this.persona = persona;
        this.vehiculo = vehiculo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCantidadFaltas() {
        return cantidadFaltas;
    }

    public void setCantidadFaltas(int cantidadFaltas) {
        this.cantidadFaltas = cantidadFaltas;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
     public void setExamen(Scanner scan) {
        System.out.println("Ingrese la fecha del examen: ");
        this.fecha = LocalDate.parse(scan.next());
        
        System.out.println("Ingrese los datos de la persona: ");        
        this.persona.setPersona(scan);
        this.vehiculo.setVehiculo(scan);
        setCircuito(scan);
        if(resultado()){
            this.resultadoExamen = "Aprobado";
        }else{
            this.resultadoExamen = "Reprobado";
        }
    }
    
    public abstract int cantidadFaltas();
    
    public abstract int cantidadSegundos();
    
    public abstract void setCircuito(Scanner scan);
    
    public abstract boolean resultado();
    
    public boolean busquedaPorDni(int dni){
        if(this.persona.getDni() == dni){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Examen: " + "resultado: "+this.resultadoExamen+ "| cantidadFaltas=" + cantidadFaltas + ", segundos=" + segundos + ", fecha=" + fecha + ", " + persona + ", " + vehiculo;
    }
    
    
}
