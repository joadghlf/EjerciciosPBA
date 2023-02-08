/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Interfaces.Ejercicio3;

/**
 *
 * @author jgiuliano
 */
public class MenuDelDia extends PrimerPlato implements Postre,SegundoPlato{

    
    @Override
    public void PedirDulce() {
       System.out.println("Pedir dulce");
    }

    @Override
    public void PedirAmargo() {
        System.out.println("Pedir amargo");
    }

    @Override
    public void PedirVino() {
       System.out.println("Pedir el vino");
    }
    
}
