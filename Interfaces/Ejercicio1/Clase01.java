/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Interfaces.Ejercicio1;

/**
 *
 * @author jgiuliano
 */
public class Clase01 implements Cloneable{
    private String a,b,c,d;

    public Clase01(String a, String b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Clase01() {
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    protected Clase01 clone() throws CloneNotSupportedException {
        Clase01 obj = new Clase01();
        obj.setA(this.a);
        obj.setB(this.b);
        obj.setC(this.c);
        obj.setD(this.d);
        return obj;
    }
    
    public void concAtributos(){
        System.out.println(a+b+c+d);
    }
    
}
