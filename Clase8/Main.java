/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Clase8;

/**
 *
 * @author jgiuliano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DocumentoPDF pdf = new DocumentoPDF();
        DocumentoWord word = new DocumentoWord();
        
        Impresora imp = new Impresora();
        imp.imprimir(word);
    }
    
}
