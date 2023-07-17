/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.arboles.contactos;

import ec.edu.ups.arboles.contactos.controller.ArbolContactos;
import ec.edu.ups.arboles.contactos.models.Contacto;

/**
 *
 * @author SOPORTETICS
 */
public class ArbolesContactos {

    public static void main(String[] args) {
        ArbolContactos a = new ArbolContactos();
        Contacto c1 = new Contacto("12345", "Juan");
        Contacto c2 = new Contacto("12345", "Maria");
        Contacto c3 = new Contacto("12345", "Pedro");
        Contacto c4 = new Contacto("12345", "Pablo");
        a.insert(c1);
        a.insert(c2);
        a.insert(c3);
        a.insert(c4);
        a.insert(new Contacto("12345","Julina"));
        a.insert(new Contacto("12345","Jhon"));
    }
}
