/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.arboles.contactos.models;

/**
 *
 * @author SOPORTETICS
 */
public class Contacto {
    
    private String numero;
    private String nombre;

    public Contacto() {
    }

    public Contacto(String numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Contacto{" + "numero=" + numero + ", nombre=" + nombre + '}';
    }
    
    
    
}
