/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.ExamenDiciembre;

/**
 *
 * @author jgiuliano
 */
public class Espanola extends Baraja {

    public Espanola(int cantNaipes) {
        super(cantNaipes);
    }

    public Espanola(boolean naipes89) {
        if(naipes89){
            this.cantNaipes = 48;
        }else{
            this.cantNaipes = 40;
        }
        this.palos.add("ORO");
        this.palos.add("COPA");
        this.palos.add("ESPADA");
        this.palos.add("BASTO");
        
        for (int j = 0; j < palos.size(); j++) {
           for (int i = 1; i <= (this.cantNaipes)/4; i++) {
            if(!naipes89 && (i == 8 || i== 9)){
                this.naipes.add(new Naipe(i+3, palos.get(j)));
            }else{
                this.naipes.add(new Naipe(i, palos.get(j)));
            }            
        }    
        }
           
    }
    
    
    
}
