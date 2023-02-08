/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Discográfica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jgiuliano
 */
public class GestionMusical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Disco> discos = new ArrayList();
        Set<Musico> musicos = new HashSet<>();
        List<Solista> solistas = new ArrayList<>();
        altaMusicos(musicos,solistas);
        System.out.println(musicos.size());
        
        altaDiscos(discos,musicos);

        System.out.println("Comenzamos recorrido con los solistas");
        System.out.println(solistas);
        System.out.println("Continuamos con los discos");
        System.out.println(discos);
    }

    private static void altaDiscos(List<Disco> discos, Set<Musico> musicos) {
        Cancion c1 = new Cancion("Love, Forever Changes", 2571);
        Cancion c2 = new Cancion("Ramones", 1976);
        Cancion c3 = new Cancion("Robert Johnson, King of the Delta Blues Singers", 1961);
        Cancion c4 = new Cancion("Aretha Franklin, I Never Loved a Man the Way I love You ", 1967);
        Cancion c5 = new Cancion("Marvin Gaye, What's Going On", 1971);
        Cancion c6 = new Cancion("Fleetwood Mac, Rumours", 1977);
        Cancion c7 = new Cancion("Eminem, The Marshall Mathers LP", 2000);
        Cancion c8 = new Cancion("James Brown, Live at the Apollo", 1963);
        Cancion c9 = new Cancion("The Clash, London Calling ", 1979);
        Cancion c10 = new Cancion("Love, Forever Changes", 2571);

        Iterator<Musico> itM = musicos.iterator();
        Disco disco1 = new Disco("Discos Raw", LocalDate.parse("1967-02-01"),itM.next());
        Disco disco2 = new Disco("Disco Stu", LocalDate.parse("1976-02-03"),itM.next());
        Disco disco3 = new Disco("Discos Mentosh", LocalDate.parse("1999-02-04"),itM.next());
        disco1.agregarCancion(c1);
        disco1.agregarCancion(c2);
        disco1.agregarCancion(c3);
        disco1.agregarCancion(c10);
        disco2.agregarCancion(c4);
        disco2.agregarCancion(c5);
        disco2.agregarCancion(c6);
        disco3.agregarCancion(c7);
        disco3.agregarCancion(c8);
        disco3.agregarCancion(c9);

        discos.add(disco1);
        discos.add(disco2);
        discos.add(disco3);
    }

    private static void altaMusicos(Set<Musico> musicos, List<Solista> solistas) {
        Instrumento bajo = new Bajo();
        Instrumento guitarra = new Guitarra();
        Instrumento bateria = new Bateria();
        Instrumento teclado = new Teclado();
        Solista solista1 = new Solista("Carlitos", "Oerez", "Colombia", bajo);
        Solista solista2 = new Solista("Laura", "SAD", "Costa Rica", guitarra);
        Solista solista3 = new Solista("Eve", "Sittner", "Alemania", bateria);
        Solista solista4 = new Solista("Joaquín", "Giuliano", "Brasil", teclado);
        Solista solista5 = new Solista("Alma Lucía", "Giuliano Sittner", "Argentina", null);
        solistas.add(solista1);
        solistas.add(solista2);
        solistas.add(solista3);
        solistas.add(solista4);
        solistas.add(solista5);
        
        Banda banda = new Banda("Los perez", "Ricota", "Senario", LocalDate.parse("2022-01-01"));
        banda.addMusico(solista3);
        banda.addMusico(solista4);
        banda.addMusico(solista5);
        musicos.addAll(solistas);
        musicos.add(banda);
    }

}
