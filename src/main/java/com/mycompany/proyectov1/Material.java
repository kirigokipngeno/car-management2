/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectov1;

/**
 *
 * @author Heymmy L.J
 */


public class Material {
    private String tipo;
    private boolean esUtil;

    public Material(String tipo, boolean esUtil) {
        this.tipo = tipo;
        this.esUtil = esUtil;
    }

    public boolean esUtil() {
        return esUtil;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Es útil: " + esUtil;
    }
}
