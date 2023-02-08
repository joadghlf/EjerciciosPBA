/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Biblioteca;

/**
 *
 * @author jgiuliano
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Biblioteca biblioteca = new Biblioteca();
        
        Libro l1 = new Libro(123, 24, "Amanecer", false);
        biblioteca.agregarLibro(l1);
        Libro l2 = new Libro(123, 44, "Coracha", false);
        biblioteca.agregarLibro(l2);
        Libro l3 = new Libro(123, 24, "Amanecer", false);
        biblioteca.agregarLibro(l3);
        Libro l4 = new Libro(123, 32, "Peperino", true);
        biblioteca.agregarLibro(l4);
        Cliente c1 = new Alumno("ASDSA",333, 1, "Carlos", "Perez");
        biblioteca.agregarCliente(c1);
         Cliente c2 = new Alumno("ASDSA",333, 1, "Laura", "Montaldo");
        biblioteca.agregarCliente(c2);
         Cliente c3 = new Alumno("ASDSA",333, 1, "Gringo", "Zelen");
        biblioteca.agregarCliente(c3);
        Cliente c4 = new Docente(12341,333, 1, "Susana", "Esquivel");
        biblioteca.agregarCliente(c4);
        
        biblioteca.prestarLibro(l1, c1);
        biblioteca.prestarLibro(l2, c1);
        biblioteca.prestarLibro(l3, c1);
        biblioteca.prestarLibro(l4, c1);
        
        biblioteca.listadoPrestados();
        biblioteca.masCapitulos();
        biblioteca.devolverLibro(l1, c1);
        biblioteca.listadoPrestados();
    }
    
}
