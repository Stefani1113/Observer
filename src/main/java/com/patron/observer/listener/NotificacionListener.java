package com.patron.observer.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.patron.observer.event.ReservaCreadaEvent;

@Component
public class NotificacionListener {

    /**
     * Esta clase es el Observer y espera a que ocurra el evento 
     * @param event
     */
    
    @EventListener
    public void enviarNotificacion(ReservaCreadaEvent event) {
        System.out.println("NOTIFICACIÓN");
        System.out.println("Hola " + event.getCliente());
        System.out.println("Tu reserva fue realizada con éxito");
    }
}
