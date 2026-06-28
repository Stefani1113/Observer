package com.patron.observer.event;

public class ReservaCreadaEvent {

    /**
     * Este evento lleva el nombre del cliente 
     */
    
    private final String cliente;

    public ReservaCreadaEvent(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente(){
        return cliente;
    }
}
