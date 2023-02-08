/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Interfaces.Ejercicio6;

/**
 *
 * @author jgiuliano
 */
public class Name {
    private String firstName, lastName;
    private char mi;

    public Name(String firstName, String lastName, char mi) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mi = mi;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getMi() {
        return mi;
    }

    public void setMi(char mi) {
        this.mi = mi;
    }
    
}
