/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectov1;


/**
 *
 * @author Heymmy L.J
 */
public class Proyectov1 {

    public static void main(String[] args) {
     /*
        // Crear la fábrica
        Fabrica fabrica = new Fabrica();

        // Crear algunos pedidos de prueba
        Pedido pedido1 = new Pedido(TipoAuto.SEDAN_LUJO, 120, 50000);
        Pedido pedido2 = new Pedido(TipoAuto.SUV_LUJO, 150, 60000);
        Pedido pedido3 = new Pedido(TipoAuto.PICKUP_ALTA_GAMA, 180, 70000);

        // Encolar pedidos en la fábrica
        System.out.println("Encolando pedidos...");
        fabrica.encolaPedido(pedido1);
        fabrica.encolaPedido(pedido2);
        fabrica.encolaPedido(pedido3);

        // Mostrar el estado de la cola de pedidos después de encolar
        System.out.println("Estado de la cola de pedidos después de encolar:");
        System.out.println(fabrica.pedidos);

        // Atender (desencolar) un pedido y mostrar el pedido atendido
        System.out.println("Atendiendo un pedido...");
        Pedido pedidoAtendido = fabrica.atiendePedido();
        System.out.println("Pedido atendido: " + pedidoAtendido);

        // Mostrar el estado de la cola de pedidos después de atender un pedido
        System.out.println("Estado de la cola de pedidos después de atender un pedido:");
        System.out.println(fabrica.pedidos);

        // Atender el resto de los pedidos
        System.out.println("Atendiendo los pedidos restantes...");
        fabrica.atiendePedido();
        fabrica.atiendePedido(); // Asumiendo que atendemos todos los pedidos

        // Verificar que la cola está vacía después de atender todos los pedidos
        System.out.println("Estado final de la cola de pedidos:");
        System.out.println(fabrica.pedidos);
        
        Juego juego = new Juego();
        juego.iniciarJuego();
    */
     // Fábrica 1 - Diseñada para cumplir objetivos
        System.out.println("Fábrica 1 - Intentando cumplir objetivos:");
        Fabrica fabrica1 = new Fabrica(3, 90000, 5); // Max órdenes perdidas, objetivo de dinero, espacios en cinta
        
        fabrica1.generarMateriales(); // Generar materiales
        
        // Encolar pedidos que eventualmente cumplirán los objetivos de la fábrica
        fabrica1.encolaPedido(new Pedido(TipoAuto.SEDAN_LUJO, 120, 50000));
        fabrica1.encolaPedido(new Pedido(TipoAuto.SUV_LUJO, 150, 60000));
        fabrica1.encolaPedido(new Pedido(TipoAuto.PICKUP_ALTA_GAMA, 180, 70000));
        
        fabrica1.generarMateriales(); // Generar más materiales
        
        // Intentar atender los pedidos
        fabrica1.atiendePedido();
        fabrica1.atiendePedido();
        fabrica1.atiendePedido();

        // Ajustes manuales para cumplir objetivos (simulación)
        // Estos ajustes son para fines de demostración; tu lógica de juego real debería determinar estos valores
        fabrica1.setDineroObtenido(90000); 
        fabrica1.setOrdenesPerdidas(1);
        
        // Verificar y mostrar el estado final
        mostrarEstadoFabrica(fabrica1);

        // Fábrica 2 - Diseñada para NO cumplir objetivos
        System.out.println("\nFábrica 2 - Intentando y fallando en cumplir objetivos:");
        Fabrica fabrica2 = new Fabrica(2, 125000, 4); // Condiciones más difíciles
        
        fabrica2.generarMateriales(); // Generar materiales
        
        // Encolar pedidos
        fabrica2.encolaPedido(new Pedido(TipoAuto.MAQUINARIA_ALTA_GAMA, 0, 17500));
        fabrica2.encolaPedido(new Pedido(TipoAuto.SUPERAUTO_DEPORTIVO, 0, 20000));
        
        fabrica2.generarMateriales(); // Generar más materiales
        
        // Intentar atender los pedidos
        fabrica2.atiendePedido();
        fabrica2.atiendePedido();

        // Ajustes manuales para NO cumplir objetivos (simulación)
        fabrica2.setDineroObtenido(37500); // Menos del objetivo
        fabrica2.setOrdenesPerdidas(3); // Igual al máximo permitido, pero sin cumplir el objetivo de dinero
        
        // Verificar y mostrar el estado final
        mostrarEstadoFabrica(fabrica2);
    }

    private static void mostrarEstadoFabrica(Fabrica fabrica) {
        boolean objetivoCumplido = fabrica.haCumplidoObjetivo();
        if (objetivoCumplido) {
            System.out.println("Objetivos de la fábrica cumplidos. Avanzas al siguiente nivel.");
        } else {
            System.out.println("No se cumplieron los objetivos de la fábrica. Intenta de nuevo.");
        }
        System.out.println("Dinero obtenido: " + fabrica.getDineroObtenido());
        System.out.println("Órdenes perdidas: " + fabrica.getOrdenesPerdidas());
     
    }
}

    

