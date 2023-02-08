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
public class Persona {
    private int dni;
    private LocalDate fechaNacimiento;
    private String nombre, apellido;

    public Persona() {
    }

    public int getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setPersona(Scanner scan){
        System.out.print("Ingrese el dni de la persona: ");
        this.dni = scan.nextInt();
        System.out.print("Ingrese el nombre de la persona: ");
        this.nombre = scan.next();
        System.out.print("Ingrese el apellido de la persona: ");
        this.apellido = scan.next();        
        System.out.print("Ingrese la fecha de nacimiento de la persona: ");
        this.fechaNacimiento = LocalDate.parse(scan.next());
    }

    public Persona(int dni, LocalDate fechaNacimiento, String nombre, String apellido) {
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona:" + "dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre + ", apellido=" + apellido;
    }
    
}
