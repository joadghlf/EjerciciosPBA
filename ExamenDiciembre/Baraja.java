/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.ExamenDiciembre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jgiuliano
 */
public class Baraja {
    protected List<Naipe> naipes = new ArrayList<>();
    protected int cantNaipes;
    protected List<String> palos = new ArrayList();

    public Baraja(){
        
    }
    public Baraja(int cantNaipes) {
        this.cantNaipes = cantNaipes;
    }

    public List<Naipe> getNaipes() {
        return naipes;
    }

    public void setNaipes(List<Naipe> naipes) {
        this.naipes = naipes;
    } 

    public int getCantNaipes() {
        return cantNaipes;
    }

    public void setCantNaipes(int cantNaipes) {
        this.cantNaipes = cantNaipes;
    }

    public List<String> getPalos() {
        return palos;
    }

    public void setPalos(List<String> palos) {
        this.palos = palos;
    }
    
    
    public int naipesDisponibles(){
        return naipes.size();
    }

    public void ordenar(){
        Collections.sort(naipes);
    }
    
    public void barajar(){
        Collections.shuffle(naipes);
    }
    
    public List<Naipe> darNaipes(int n){
        List<Naipe> naipesDevueltos = new ArrayList<>();
        if(n <= this.naipes.size()){
            for (int i = 0; i < n; i++) {
                naipesDevueltos.add(this.naipes.get(0));
                this.naipes.remove(0);
            }
        }
        return naipesDevueltos;
    }
    
    @Override
    public String toString() {
        return "Baraja: " +getClass().getSimpleName()+", cantNaipes=" + cantNaipes + ", palos=" + palos + " naipes: " + naipes ;
    }   
    
    
}
