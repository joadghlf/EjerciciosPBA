/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase2;

public class Empleado {
    private String nombre, apellido;
    private int edad, salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int edad, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }
    
    public void redefineSueldo(int edad, int plus){
        if(this.edad >= edad){
            this.salario += plus;
        }
    }

    @Override
    public String toString() {
        return "empleado " + nombre + apellido + ", de " + edad + " años, tiene un salario de " + salario;
    }
    
}
