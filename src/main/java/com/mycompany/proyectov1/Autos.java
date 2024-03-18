/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectov1;

/**
 *
 * @author Heymmy L.J
 */
public class Autos {
    private String nombre;
    private MaterialNodo materialesCabeza; // Cabeza de la lista de materiales necesarios
    private int valor;

    public Autos(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
        this.materialesCabeza = null; // Inicialmente, la lista de materiales está vacía
    }

    // Inserta un material a la lista de materiales necesarios
    public void insertaMaterial(Material material) {
        MaterialNodo nuevoMaterial = new MaterialNodo(material);
        if (materialesCabeza == null) {
            materialesCabeza = nuevoMaterial;
        } else {
            MaterialNodo aux = materialesCabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevoMaterial);
        }
    }
    
    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    // Método toString para representar el auto y sus materiales
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Auto: " + nombre + ", Valor: $" + valor + ", Materiales: ");
        MaterialNodo aux = materialesCabeza;
        while(aux != null){
            s.append(aux.getMaterial()).append(", ");
            aux = aux.getSiguiente();
        }
        return s.toString();
    }
}
