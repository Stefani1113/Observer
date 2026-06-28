package com.patron.observer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patron.observer.service.ReservaService;

@RestController
public class ReservaController {

    /**
     * Ruta de reserva
     */
    
    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @GetMapping("/reservas")
    public String reserva() {
        return service.crearReserva();
    }
}
