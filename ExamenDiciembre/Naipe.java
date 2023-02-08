/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.ExamenDiciembre;

/**
 *
 * @author jgiuliano
 */
public class Naipe implements Comparable<Naipe>{
    private int numero;
    private String palo;

    public Naipe(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Naipe() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "\nNaipe =" + numero + ", palo=" + palo;
    }

    @Override
    public int compareTo(Naipe o) {
       if(this.palo.equals(o.palo)){
           if(this.numero == o.numero){
               return 0;
           }else if (this.numero > o.numero) {
               return 1;
           }else{
               return -1;
           }
       }else{
            return this.palo.compareTo(o.palo);
        }
    }
}
