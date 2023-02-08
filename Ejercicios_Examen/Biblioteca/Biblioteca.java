/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jgiuliano
 */
public class Biblioteca {
    private List<Libro> libros = new ArrayList();
    private Set<Cliente> clientes = new HashSet();

    public Biblioteca() {
    }
    
    public void agregarLibro(Libro l){
        libros.add(l);
    }

    public void agregarCliente(Cliente c){
        clientes.add(c);
    }
    
    public void prestarLibro(Libro unLibro, Cliente unCliente){
        Iterator<Libro> it = libros.iterator();
        Iterator<Cliente> itCliente = clientes.iterator();
        boolean flag = true;
        while (it.hasNext() && flag) {
            Libro nextLibro = it.next();
            if(nextLibro.getTitulo().equals(unLibro.getTitulo())){
              if(!nextLibro.isEstado()){
                  while (itCliente.hasNext()) {
                      Cliente nextCliente = itCliente.next();
                      if(nextCliente.getDni() == unCliente.getDni()){
                          if(nextCliente.pedirLibroPrestado()){
                              nextCliente.tomarLibro(nextLibro);
                              nextLibro.setEstado(true);
                              flag = false;
                          }else{
                              System.out.println("El alumno ya tiene 2 libros que ha tomado prestados");
                              flag = false;
                          }
                      }
                  }                  
            }else{
                  System.out.println("El libro ya ha sido prestado ");
                  flag = false;
              }  
            }
        }if(flag){
            System.out.println("No se ha encontrado el libro o el cliente solicitado");
        }
    }
    
    public void devolverLibro(Libro unLibro, Cliente unCliente){
        Iterator<Libro> it = libros.iterator();
        Iterator<Cliente> itCliente = clientes.iterator();
        boolean flag = true;
        while (it.hasNext() && flag) {
            Libro nextLibro = it.next();
            if(nextLibro.getTitulo().equals(unLibro.getTitulo())){
              if(nextLibro.isEstado()){
                  while (itCliente.hasNext()) {
                      Cliente nextCliente = itCliente.next();
                      if(nextCliente.getDni() == unCliente.getDni()){
                              nextCliente.devolverLibro(nextLibro);
                              nextLibro.setEstado(false);
                              flag = false;
                      }
                  }                  
            }else{
                  System.out.println("El libro no ha sido prestado ");
                  flag = false;
              }  
            }
        }if(flag){
            System.out.println("No se ha encontrado el libro o el cliente solicitado");
        }
    }
    
    public void listadoPrestados(){
        for (Libro libro : libros) {
            if(libro.isEstado()){
                System.out.println(libro.toString());
            }
        }
    }
    
    public void masCapitulos(){
        int max = 0;
        Libro libroMax = new Libro();
        for (Libro libro : libros) {
            if(max<libro.getCapitulos()){
                max = libro.getCapitulos();
                libroMax = libro;
            }
        }
        if(max>0){
            System.out.println("EL libro con más capitulos es: ");
            System.out.println(libroMax);
        }
    }    
}
