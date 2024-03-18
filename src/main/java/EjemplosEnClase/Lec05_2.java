/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EjemplosEnClase;

/**
 *
 * @author Pablo
 */
public class Lec05_2 {

    public static void main(String[] args) {
        Lista laLista = new Lista();
        laLista.inserta(new Persona(10, "Juan"));
        laLista.inserta(new Persona(5, "Pedro"));
        laLista.inserta(new Persona(15, "Alberto"));
        laLista.inserta(new Persona(20, "Daniela"));
        laLista.inserta(new Persona(30, "Sebastian"));
        laLista.inserta(new Persona(18, "Pablo"));
        laLista.inserta(new Persona(40, "Esteban"));
        
        System.out.println(laLista);
    }
}
