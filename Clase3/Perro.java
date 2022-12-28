/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase2.Clase3;

import java.time.LocalDate;

/**
 *
 * @author jgiuliano
 */
public class Perro {
    private boolean adoptado, lastimado, tieneChip, perdido;
    private int ano, mordio;
    private double peso;
    private String raza, nombre;

    public Perro() {
    }

    public Perro(boolean adoptado, boolean lastimado, boolean tieneChip, int ano, double peso, String raza, String nombre) {
        this.adoptado = adoptado;
        this.lastimado = lastimado;
        this.tieneChip = tieneChip;
        this.ano = ano;
        this.peso = peso;
        this.raza = raza;
        this.nombre = nombre;
        this.mordio = 0;
    }
    
    public void edad(){
        LocalDate date = LocalDate.now();
        System.out.println(date.getYear()-this.ano);
    }
    
    public void perdible(){
        if(this.tieneChip){
            System.out.println("El perro puede ser encontrado");
        }else{
            System.out.println("El perro se puede perder");
        }
    }
    
    public void adoptable(){
        if(!this.lastimado && this.peso > 5){
            System.out.println("El perro puede ser adoptado");
        }else{
            System.out.println("El perro no puede ser adoptado");
        }
    }
    
    public void mordio(){
        this.mordio ++;
    }
    
    public void cobrarMulta(){
        if(this.mordio > 2){
            System.out.println("Se debe cobrar multa al perrrito");
        }else{
            System.out.println("El perrito mordió "+this.mordio+" veces, no se debe aplicar multa");
        }
        
    }
}
