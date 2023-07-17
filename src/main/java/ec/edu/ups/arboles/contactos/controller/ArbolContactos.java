/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.arboles.contactos.controller;

import ec.edu.ups.arboles.contactos.models.Contacto;
import ec.edu.ups.arboles.contactos.models.Node;

/**
 *
 * @author SOPORTETICS
 */
public class ArbolContactos {
    
    private Node raiz;
    
    public ArbolContactos() {
        raiz = null;
    }
    
    public void insert(Contacto contacto) {
        if (raiz == null) {
            raiz = new Node(contacto);
        } else {
            insertRecursivo(raiz, contacto);
        }
    }
    
    private void insertRecursivo(Node nodo, Contacto contacto) {
        if (contacto.getNombre().compareTo(nodo.getContacto().getNombre()) < 0) {
            if (nodo.getLeft() == null) {
                nodo.setLeft(new Node(contacto));
            }else{
                insertRecursivo(nodo.getLeft(), contacto);
            }
        } else if (contacto.getNombre().compareTo(nodo.getContacto().getNombre()) > 0) {
            if (nodo.getRight()== null) {
                nodo.setRight(new Node(contacto));
            }else{
                insertRecursivo(nodo.getRight(), contacto);
            }
        } else {
            
        }
    }
    
    public boolean estaEquilibrado(){
        return verificarBalance(raiz);
    }
    
    private boolean verificarBalance(Node nodo){
        if(nodo==null){
            return true;
        }
        
        
        int alturaIzq = obtenerAltura(nodo.getLeft());
        int alturaDer= obtenerAltura(nodo.getRight());
        int diferencia = Math.abs(alturaIzq-alturaDer);
        if(diferencia>1){
            return false;
        }
        
        return verificarBalance(nodo.getLeft())&&verificarBalance(nodo.getRight());
        
    }
    private int obtenerAltura(Node nodo){
        if(nodo == null){
            return 0;
        }
        int alturaIzq=obtenerAltura(nodo.getLeft());
        int alturaDer=obtenerAltura(nodo.getRight());
        return Math.max(alturaIzq, alturaDer)+1;
    }
}
