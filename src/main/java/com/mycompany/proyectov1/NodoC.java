/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectov1;

/**
 *
 * @author Heymmy L.J
 */
public class NodoC {
    private Pedido pedido; // Suponiendo una clase Pedido que representa un pedido de auto
    private NodoC atras;

    public NodoC(Pedido pedido) {
        this.pedido = pedido;
        this.atras = null;
    }

    // Getters y setters
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public NodoC getAtras() {
        return atras;
    }

    public void setAtras(NodoC atras) {
        this.atras = atras;
    }
    
    @Override
    public String toString() {
        return pedido.toString(); // Asumiendo que Pedido tiene un método toString adecuado
    }
}
