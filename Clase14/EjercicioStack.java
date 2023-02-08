/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Clase14;

import java.util.Stack;

/**
 *
 * @author jgiuliano
 */
public class EjercicioStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadena = "babbbacabbbab";
       String separador = "c";
       int cont = 0;
       Stack<String> secuencia = new Stack();
       boolean flag = true;
       int position = cadena.indexOf("c");
        for (int i = position+1; i < cadena.length(); i++) {
            System.out.println(cadena.substring(i,i+1));
            secuencia.push(cadena.substring(i,i+1));
        }
        while(flag && secuencia.size()>0){
            if(!secuencia.pop().equals(cadena.substring(cont,cont+1))){
                flag = false;
            }
            cont++;
        }
       if(flag){
           System.out.println("Son expresiones capicua");
       }else{
           System.out.println("No son expresiones capicua");
       }
       
    }
    
}
