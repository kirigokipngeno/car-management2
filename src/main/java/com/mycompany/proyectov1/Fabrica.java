/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectov1;

/**
 *
 * @author Heymmy L.J
 */
import java.util.Random;

public class Fabrica {

    private Cola pedidos; // Cola de pedidos de autos
    private Cola cintaTransportadora; // Cinta transportadora de materiales
    private Cola basurero; // Basurero para materiales
    private Cola hub; // HUB indicador de pedidos entrantes
    private int dineroObtenido; // Dinero obtenido durante la ejecución del juego
    private int ordenesPerdidas; // Contador de órdenes perdidas
    private final int MAX_ORDENES_PERDIDAS; // Máximo de órdenes perdidas permitidas
    private final int OBJETIVO_DINERO; // Dinero objetivo para ganar la fábrica
    private final int ESPACIOS_CINTA_TRANSPORTADORA; // Cantidad de espacios en la cinta transportadora

    // Constructor
    public Fabrica(int maxOrdenesPerdidas, int objetivoDinero, int espaciosCintaTransportadora) {
        this.pedidos = new Cola();
        this.cintaTransportadora = new Cola();
        this.basurero = new Cola();
        this.hub = new Cola();
        this.dineroObtenido = 0;
        this.ordenesPerdidas = 0;
        this.MAX_ORDENES_PERDIDAS = maxOrdenesPerdidas;
        this.OBJETIVO_DINERO = objetivoDinero;
        this.ESPACIOS_CINTA_TRANSPORTADORA = espaciosCintaTransportadora;
    }

    public int getDineroObtenido() {
        return dineroObtenido;
    }

    public int getOrdenesPerdidas() {
        return ordenesPerdidas;
    }

    // Método setter para dineroObtenido
    public void setDineroObtenido(int dineroObtenido) {
        this.dineroObtenido = dineroObtenido;
    }

    // Método setter para ordenesPerdidas
    public void setOrdenesPerdidas(int ordenesPerdidas) {
        this.ordenesPerdidas = ordenesPerdidas;
    }

    // Método para encolar un nuevo pedido
    public void encolaPedido(Pedido pedido) {
        pedidos.encola(pedido);
        hub.encola(pedido);
    }

    // Método para atender (o construir) el próximo pedido
    public void atiendePedido() {
        Pedido pedidoAtendido = pedidos.desencola();
        if (pedidoAtendido != null) {
            TipoAuto tipoAuto = pedidoAtendido.getTipoAuto();
            int precio = pedidoAtendido.getPrecio();

            // Verificar si se pueden construir autos con los materiales disponibles
            if (cintaTransportadora.getSize() >= 3) {
                switch (tipoAuto) {
                    case SEDAN_LUJO, SUV_LUJO, PICKUP_ALTA_GAMA -> {
                        if (tipoAuto == TipoAuto.SEDAN_LUJO) {
                            dineroObtenido += 5000;
                        } else if (tipoAuto == TipoAuto.SUV_LUJO) {
                            dineroObtenido += 10000;
                        } else if (tipoAuto == TipoAuto.PICKUP_ALTA_GAMA) {
                            dineroObtenido += 12000;
                        }
                        for (int i = 0; i < 3; i++) {
                            cintaTransportadora.desencola();
                        }
                    }
                    case MAQUINARIA_ALTA_GAMA -> {
                        if (cintaTransportadora.getSize() >= 4) {
                            dineroObtenido += 17500;
                            for (int i = 0; i < 4; i++) {
                                cintaTransportadora.desencola();
                            }
                        } else {
                            ordenesPerdidas++;
                        }
                    }
                    case SUPERAUTO_DEPORTIVO -> {
                        if (cintaTransportadora.getSize() >= 5) {
                            dineroObtenido += 20000;
                            for (int i = 0; i < 5; i++) {
                                cintaTransportadora.desencola();
                            }
                        } else {
                            ordenesPerdidas++;
                        }
                    }
                }
            } else {
                ordenesPerdidas++;
            }
        }
    }

    // Método para generar materiales en la cinta transportadora
    public void generarMateriales() {
        Random random = new Random();
        for (int i = 0; i < ESPACIOS_CINTA_TRANSPORTADORA - cintaTransportadora.getSize(); i++) {
            boolean esUtil = random.nextBoolean();
            String tipo = esUtil ? "Útil" : "No útil";

        }
    }

    // Método para gestionar materiales en la cinta transportadora y basurero
    public void gestionarMateriales() {
        while (cintaTransportadora.getSize() > 0) {
            Pedido material = cintaTransportadora.desencola();
            if (material.esUtil()) {
                cintaTransportadora.encola(material);
            } else {
                basurero.encola(material);
            }
        }
    }

    // Método para verificar si se ha cumplido el objetivo de dinero
    public boolean haCumplidoObjetivo() {
        return dineroObtenido >= OBJETIVO_DINERO && ordenesPerdidas <= MAX_ORDENES_PERDIDAS;
    }

    // Método para actualizar el HUB indicador de pedidos entrantes
    public void actualizarHub() {
        // Aquí podrías agregar la lógica para actualizar el HUB con los aspectos del juego que se requieran
    }

    // Métodos getter y setter necesarios según las especificaciones del juego
    // ...
}
