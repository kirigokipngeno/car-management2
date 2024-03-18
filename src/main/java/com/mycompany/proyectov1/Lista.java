/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectov1;

/**
 *
 * @author Heymmy L.J
 */
public class Lista {
    
}


/*
Ejemplo de Lista simple visto en clases

public class Lista {

    private Nodo cabeza;

    public void inserta(Persona p) {
        if (cabeza == null) { // 1 si la lista esta vacia
            cabeza = new Nodo(p);
        } else if (p.getId() < cabeza.getDato().getId()) {
            //2 Si necesito insertar una persona antes de
            //cabeza
            Nodo aux = new Nodo(p);
            aux.setNext(cabeza);
            cabeza = aux;
        } else if (cabeza.getNext() == null) {
            // 3 Si necesito insertar despues de cabeza
            //y el siguiente de cabeza esta vacio 
            //(solo hay un elemento en lista)
            cabeza.setNext(new Nodo(p));
        }else{
            // 4 si necesito insertar al medio o al final
            Nodo aux =cabeza;
            
            //Primero me ubico en la posicion anterior 
            //antes de insertar
            while(aux.getNext() != null &&
                    aux.getNext().getDato().getId() < p.getId()){
                aux = aux.getNext();
            }
            
            //Agrego el nodo y corrijo enlaces
            Nodo temp = new Nodo(p);      // creo un nodo con la info de p
            temp.setNext(aux.getNext());  // asigno el sig de temp como el sig de aux
            aux.setNext(temp);            // cambio el sig de aux por temp
        }
    }
    
    @Override
    public String toString()
    {
        Nodo aux = cabeza;
        String s = "Lista: ";
        while(aux != null){
            s += aux +", ";
            aux = aux.getNext();
        }
        return s;
    }    
}



*/