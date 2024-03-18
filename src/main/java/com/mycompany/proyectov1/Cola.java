/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectov1;

/**
 *
 * @author Heymmy L.J
 */
public class Cola {
    private NodoC frente;
    private NodoC fin;

    public Cola() {
        this.frente = null;
        this.fin = null;
    }

    public boolean esVacia() {
        return frente == null;
    }

    public void encola(Pedido pedido) {
        NodoC nuevo = new NodoC(pedido);
        if (esVacia()) {
            frente = nuevo;
        } else {
            fin.setAtras(nuevo);
        }
        fin = nuevo;
    }

    public Pedido desencola() {
        if (esVacia()) {
            return null; // Manejar el caso de cola vacía adecuadamente
        }
        Pedido pedido = frente.getPedido();
        frente = frente.getAtras();
        if (frente == null) {
            fin = null;
        }
        return pedido;
    }
    
    public int getSize() {
    int count = 0;
    NodoC current = frente;
    while (current != null) {
        count++;
        current = current.getAtras();
    }
    return count;
}


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        NodoC aux = frente;
        while(aux != null){
            s.append(aux.getPedido().toString()).append("\n");
            aux = aux.getAtras();
        }
        return s.toString();
    }
}
