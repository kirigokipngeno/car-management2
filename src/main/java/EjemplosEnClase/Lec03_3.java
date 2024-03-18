/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EjemplosEnClase;

/**
 *
 * @author Pablo
 */
public class Lec03_3 {

    public static void main(String[] args) {
        Pila p = new Pila();
        p.apilar();
        p.apilar();
        p.apilar();
        System.out.println(p);
        p.desapilar();
        System.out.println(p);
        p.desapilar();
        System.out.println(p);
        p.apilar();
        System.out.println(p);
    }
}
