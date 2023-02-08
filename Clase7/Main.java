/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Clase7;

/**
 *
 * @author jgiuliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mayor = 0, elMayor = 0;
        
        Pelicula peli = new Pelicula(1999, "El olocausto", "acción", 1500, true);
        Pelicula peli2 = new Pelicula(2022, "El atardecer", "comedia", 1000, false);
        Serie serie = new Serie(11, "Friends", "comedia", 1200, true);
        Serie serie2 = new Serie(4, "Straing things", "intriga", 900, false);
        
        Video[] videos = new Video[4];
        videos[0] = peli;
        videos[1] = peli2;
        videos[2] = serie;
        videos[3] = serie2;
        
        for (int i = 0; i < videos.length; i++) {
            if(videos[i].getClass().getSimpleName().equals("Serie")){
                videos[i].setVisto(true);
            }else if(videos[i].getClass().getSimpleName().equals("Pelicula")){
                Pelicula pelicula = (Pelicula) videos[i];
                pelicula.peliFechaPublicacion(2022);
            }
            if(videos[i].duracion > mayor){
                mayor = videos[i].duracion;
                elMayor = i;
            }  
            
            System.out.println(videos[i].toString());
        }
        System.out.println("El video de mayor duración es "+videos[elMayor].toString());
        
    }
    
}
