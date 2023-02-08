/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Interfaces.Ejercicio1;

/**
 *
 * @author jgiuliano
 */
public class ArrayReales implements Estadisticas{
    double[] arrayreales = new double[10]; 

    public ArrayReales() {
    }

    public void setArrayreales(double[] arrayreales) {
        this.arrayreales = arrayreales;
    }
    
    

    @Override
    public double minimimo() {
        double minimo = 0;
        
        for (int i = 0; i < arrayreales.length; i++) {
            if(minimo > arrayreales[i]){
                minimo = arrayreales[i];
            }
        }
        
        return minimo;
    }

    @Override
    public double maximo() {
        double maximo = 0;
        
        for (int i = 0; i < arrayreales.length; i++) {
            if(maximo < arrayreales[i]){
                maximo = arrayreales[i];
            }
        }
        
        return maximo;
    }

    @Override
    public double sumatorio() {
         double suma = 0;
        
        for (int i = 0; i < arrayreales.length; i++) {
           suma += arrayreales[i];
        }
        
        return suma;
    }
    
}
