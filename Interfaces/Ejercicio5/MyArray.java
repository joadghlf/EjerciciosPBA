/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Interfaces.Ejercicio5;

/**
 *
 * @author jgiuliano
 */
public class MyArray implements Comparable<MyArray> {
    
    int[] obj;

    public MyArray(int[] obj) {
        this.obj = obj;
    }    

    public int[] getObj() {
        return obj;
    }

    public void setObj(int[] obj) {
        this.obj = obj;
    }
    
    
    @Override
    public int compareTo(MyArray o) {
        int sumA = 0, sumB = 0;
        for (int i = 0; i < this.obj.length; i++) {
            sumA += this.obj[i];
        }
        for (int i = 0; i < o.getObj().length; i++) {
            sumB += o.getObj()[i];
        }
        if(sumA == sumB) return 0;
        if(sumA > sumB){
                return 1;
         }else{
             return -1;
         }
    }
    
}
