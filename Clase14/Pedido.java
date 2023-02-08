/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Clase14;

/**
 *
 * @author jgiuliano
 */
public class Pedido {
    private int numeroProducto, cantidadPedida, nroCli;

    public Pedido(int numeroProducto, int cantidadPedida, int nroCli) {
        this.numeroProducto = numeroProducto;
        this.cantidadPedida = cantidadPedida;
        this.nroCli = nroCli;
    }

    public int getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public int getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(int cantidadPedida) {
        this.cantidadPedida = cantidadPedida;
    }

    public int getNroCli() {
        return nroCli;
    }

    public void setNroCli(int nroCli) {
        this.nroCli = nroCli;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numeroProducto=" + numeroProducto + ", cantidadPedida=" + cantidadPedida + ", nroCli=" + nroCli + '}';
    }
    
    
    
}
