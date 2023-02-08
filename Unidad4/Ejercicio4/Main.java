/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Unidad4.Ejercicio4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author jgiuliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Jugador> jugadores = new ArrayList();
        //Arqueros
        jugadores.add(new Jugador("Emiliano Martínez", "A", 18, 49));
        jugadores.add(new Jugador("Gerónimo Rulli", "A", 14, 46));
        jugadores.add(new Jugador("Franco Armani", "A", 31, 89));
        
        //Defensores
        jugadores.add(new Jugador("Nahuel Molina", "D", 24, 0));
        jugadores.add(new Jugador("Lisandro Martínez", "D", 24, 1));
        jugadores.add(new Jugador("Cristian Romero", "D", 18, 0));
        jugadores.add(new Jugador("Germán Pezzella", "D", 21, 0));
        jugadores.add(new Jugador("Nicolás Otamendi", "D", 22, 0));
        jugadores.add(new Jugador("Marcos Acuña", "D", 21, 2));
        jugadores.add(new Jugador("Nicolás Tagliafico", "D", 17, 1));
        jugadores.add(new Jugador("Juan Foyth", "D", 10, 1));
        
        //Mediocampistas
        jugadores.add(new Jugador("Rodrigo De Paul", "M", 21, 2));
        jugadores.add(new Jugador("Leandro Paredes", "M", 19, 0));
        jugadores.add(new Jugador("Alexis Mac Allister", "M", 17, 5));
        jugadores.add(new Jugador("Guido Rodríguez", "M", 23, 1));
        jugadores.add(new Jugador("Alejandro Gómez", "M", 18, 0));
        jugadores.add(new Jugador("Enzo Fernández", "M", 17, 1));
        jugadores.add(new Jugador("Exequiel Palacios", "M",14, 1));
        
        //Volantes
        jugadores.add(new Jugador("Ángel Di María", "V", 13, 3));
        jugadores.add(new Jugador("Lautaro Martínez", "V", 26, 12));
        jugadores.add(new Jugador("Julián Álvarez", "V", 34, 15));
        jugadores.add(new Jugador("Nicolás González", "V", 9, 2));
        jugadores.add(new Jugador("Joaquín Correa", "V", 22, 3));
        jugadores.add(new Jugador("Paulo Dybala", "V", 16, 9));
        Jugador messi = new Jugador("Lionel Messi", "V", 20, 12);
        jugadores.add(messi);
        
        Set<Jugador> titulares = new HashSet();
        Set<Jugador> suplentes = new HashSet();
        
        for (Jugador jugador : jugadores) {
            if(jugador.isTitular()){
                titulares.add(jugador);
            }else{
                suplentes.add(jugador);
            }
        }
        
        System.out.println("Los titulares son: ");
        for (Jugador titular : titulares) {
            System.out.println(titular.getNombre());
        }
         System.out.println("Y los sumplentes son: ");
        for (Jugador suplente : suplentes) {
            System.out.println(suplente.getNombre());
        }
        
        
        if(titulares.contains(messi)){
                System.out.println("Si está Messi!");
                }else{
             System.out.println("No está Messi!");
        }
    }
    
}
