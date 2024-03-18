/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectov1;

/**
 *
 * @author Heymmy L.J
 */
public class NodoL {
    private Dato elemento;
    private NodoL siguiente;

    public NodoL() {
        this.elemento = null;
        this.siguiente = null;
    }

    // Getters y setters
    public Dato getElemento() {
        return elemento;
    }

    public void setElemento(Dato elemento) {
        this.elemento = elemento;
    }

    public NodoL getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoL siguiente) {
        this.siguiente = siguiente;
    }
}
