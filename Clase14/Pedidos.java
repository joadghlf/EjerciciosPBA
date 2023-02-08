/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PBAREVIEW.Clase14;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jgiuliano
 */
public class Pedidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Deque<Pedido> pedidos = new LinkedList<>();
        pedidos.push(new Pedido(33,2,10));
        pedidos.push(new Pedido(4,1,12));
        pedidos.push(new Pedido(5,3,10));
        pedidos.push(new Pedido(55,4,13));
        pedidos.push(new Pedido(41,1,10));
        
        int nroCli = 10;
        int total = 0;
        while(!pedidos.isEmpty()){
         if(pedidos.peek().getNroCli() == nroCli){
            System.out.println(pedidos.poll());
        }else{
             pedidos.poll();
         }   
        }
        
    }
    
}
