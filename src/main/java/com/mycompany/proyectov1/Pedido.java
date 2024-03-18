/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectov1;

/**
 *
 * @author Heymmy L.J
 */
public class Pedido {
    private TipoAuto tipoAuto;
    private int tiempoRestante;
    private int precio;

    public Pedido(TipoAuto tipoAuto, int tiempoRestante,int precio) {
        this.tipoAuto = tipoAuto;
        this.tiempoRestante = tiempoRestante;
        this.precio = precio;
    }

    public TipoAuto getTipoAuto() {
        return tipoAuto;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Tipo de auto: " + tipoAuto + ", Tiempo restante: " + tiempoRestante + ", Precio: " + precio;
    }

    boolean esUtil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
