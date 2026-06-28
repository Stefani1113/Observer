package com.patron.observer.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.patron.observer.event.ReservaCreadaEvent;

@Service
public class ReservaService {

    /**
     * Realiza reserva y publica evento 
     */
    
    private final ApplicationEventPublisher publisher;

    public ReservaService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public String crearReserva() {
        String cliente = "Stefania puerta";

        System.out.println("Reserva creada para " + cliente);

        publisher.publishEvent(new ReservaCreadaEvent(cliente));

        return "reserva realizada correctamente";
    }
}
