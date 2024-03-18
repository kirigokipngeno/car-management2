/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosEnClase;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Pila {

    private NodoP cima;

    public Pila() {
        this.cima = null;
    }

    public boolean esVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar() {
        Dato d = new Dato();
        d.setNombre(JOptionPane.showInputDialog(null,
                "Digite el nombre:"));
        NodoP nuevo = new NodoP();
        nuevo.setElemento(d);
        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }
    
    public void desapilar(){
        if(!esVacia()){
            cima = cima.getSiguiente();
            JOptionPane.showMessageDialog(null,
                    "Elemento extraido");
        } else{
            JOptionPane.showMessageDialog(null,
                    "Pila vacia, no puedo extraer");
        }
    }

    @Override
    public String toString() {
        String s = "";
        if(!esVacia()){
            NodoP aux = cima;
            while(aux != null){
                s = s + aux + "\n";
                aux = aux.getSiguiente();
            }
        }
        return s;
    }
    
    
    
    
    
    
    
    
    

}
