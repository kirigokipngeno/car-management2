/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectov1;

/**
 *
 * @author Heymmy L.J
 */
public class MaterialNodo {
    private Material material;
    private MaterialNodo siguiente;

    public MaterialNodo(Material material) {
        this.material = material;
        this.siguiente = null;
    }

    // Getters y setters
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public MaterialNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(MaterialNodo siguiente) {
        this.siguiente = siguiente;
    }
}