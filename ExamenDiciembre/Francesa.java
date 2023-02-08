/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.ExamenDiciembre;

/**
 *
 * @author jgiuliano
 */
public class Francesa extends Baraja{

    public Francesa() {
        this.cantNaipes = 52;
        this.palos.add("CORAZON");
        this.palos.add("DIAMANTE");
        this.palos.add("PICA");
        this.palos.add("TREBOL");
        
        for (int j = 0; j < palos.size(); j++) {
           for (int i = 1; i <= (this.cantNaipes)/4; i++) {
                this.naipes.add(new Naipe(i, palos.get(j)));
        }    
        }
    }

    public Francesa(int cantNaipes) {
        super(cantNaipes);
    }
    
    
    
}
