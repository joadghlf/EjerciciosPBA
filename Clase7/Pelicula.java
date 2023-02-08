/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase7;

/**
 *
 * @author jgiuliano
 */
public class Pelicula extends Video{
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pelicula(int ano, String titulo, String genero, int duracion, boolean visto) {
        super(titulo, genero, duracion, visto);
        this.ano = ano;
    }
    
    public void peliFechaPublicacion(int fecha){
        if(this.ano >= fecha){
            System.out.println("Película: "+this.titulo+" año "+this.ano);
        }
    }
}
