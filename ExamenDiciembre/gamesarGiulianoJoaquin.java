/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.ExamenDiciembre;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jgiuliano
 */
public class gamesarGiulianoJoaquin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos baraja española
        Baraja espanola = new Espanola(true);
        //Creamos baraja Francesa
        Baraja francesa = new Francesa();
        //Creamos la clección de naipes
        List<Naipe> colecionNaipes = new ArrayList();
        //Imprimimos la baraja española
        System.out.println(espanola);
        //Barajamos 4 veces la baraja española
        for (int i = 0; i < 4; i++) {
            espanola.barajar();
        }
        //Damos 7 naipes
        colecionNaipes.addAll(espanola.darNaipes(7));
        //Mostramos los 7 naipes dados
        System.out.println("Mostramos los 7 naipes dados");
        System.out.println(colecionNaipes);
        //Mostramos por pantalla los naipes disponibles
        System.out.println(espanola);
        //Ordenamos baraja espanola
        espanola.ordenar();
        //Mostramos la baraja espanola ordenada
        System.out.println(espanola);
    }
    
}
