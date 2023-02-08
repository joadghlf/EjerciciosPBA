/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Interfaces.Ejercicio6;

/**
 *
 * @author jgiuliano
 */
public class Student extends Person implements Comparable<Student>{

    private String major;

    public Student(String major, Name name) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public int compareTo(Student o) {
           int order =0;
        if(this.major.equals(o.major) && getName().getFirstName().equals(o.getName().getFirstName()) && getName().getLastName().equals(o.getName().getLastName()) && getName().getMi() == o.getName().getMi()){
            return 0;
        }
        
        if(this.major.charAt(0)< o.major.charAt(0) ){
            order ++;
        }else if(this.major.charAt(0)> o.major.charAt(0) ){
            order --;
        }
         if(getName().getFirstName().charAt(0)< o.getName().getFirstName().charAt(0)){
            order ++;
        }else if(getName().getFirstName().charAt(0)> o.getName().getFirstName().charAt(0)){
            order --;
        }  
          if(getName().getLastName().charAt(0)< o.getName().getLastName().charAt(0)){
            order ++;
        }else if(getName().getLastName().charAt(0)> o.getName().getLastName().charAt(0)){
            order --;
        }
          if(getName().getMi()< o.getName().getMi()){
            order ++;
        }else if(getName().getMi()> o.getName().getMi()){
            order --;
        }          
        
        return order;
    }
}
