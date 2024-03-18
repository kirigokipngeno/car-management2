/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosEnClase;

public class Cola {

    private NodoC frente;
    private NodoC ultimo;

    public void encola(NodoC nodo) {
        if (frente == null) {
            frente = nodo;
            ultimo = nodo;
        } else {
            ultimo.setAtras(nodo);
            ultimo = nodo;
        }
    }

    public NodoC desencola() {
        NodoC aux = frente;
        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
        }
        return aux;
    }

    public void atiende() {
        NodoC nodoC = desencola();
        if (nodoC != null) {
            System.out.println("Nodo atendido: " + nodoC);
        } else {
            System.out.println("La cola está vacía. No hay nodos para atender.");
        }
    }

    public int getSize() {
        int size = 0;
        NodoC aux = frente;
        while (aux != null) {
            size++;
            aux = aux.getAtras();
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        NodoC aux = frente;
        while (aux != null) {
            builder.append(aux).append("\n");
            aux = aux.getAtras();
        }
        return builder.toString();
    }
}
