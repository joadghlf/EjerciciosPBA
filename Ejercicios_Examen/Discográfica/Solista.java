/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBAREVIEW.Ejercicios_Examen.Discográfica;

/**
 *
 * @author jgiuliano
 */
public class Solista extends Musico{
    private String nombre, apellido, nacionalidad;
    private Instrumento instrumento;

    public Solista() {
    }

    public Solista(String nombre, String apellido, String nacionalidad, Instrumento instrumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.instrumento = instrumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public String toString() {
        String nombreInstrumento;
        if(instrumento!= null){
            nombreInstrumento = instrumento.getClass().getSimpleName();
        }else{
            nombreInstrumento = "Cantante";
        }
        return "\nSolista= " + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", instrumento=" + nombreInstrumento;
    }
    
    
    
}
