/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase4;

/**
 *
 * @author jgiuliano
 */
public class Password {
    private int longitud;
    private String texto;

    public int getLongitud() {
        return longitud;
    }

    public Password() {
    }

    public Password(String texto) {
        this.longitud = texto.length();
        this.texto = texto;
    }
    
    public boolean esFuerte(){
        int mayuscula = 0, minuscula = 0, numero = 0; 
        for (int i = 0; i < this.texto.length(); i++) {
            if(Character.isLowerCase(texto.charAt(i))){
             minuscula ++;   
            }else if(Character.isUpperCase(texto.charAt(i))){
                mayuscula ++;
            }else if(Character.isDigit(texto.charAt(i))){
                numero ++;
            }
        }
        System.out.println("Ma "+mayuscula+" Min "+minuscula+" dig "+numero+" res "+(mayuscula > 2 && minuscula > 1 && numero > 5));
        return (mayuscula > 2 && minuscula > 1 && numero > 5);
    }
    
}
