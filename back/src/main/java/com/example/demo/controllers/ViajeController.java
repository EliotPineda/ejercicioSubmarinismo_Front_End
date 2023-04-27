package com.example.demo.controllers;

import com.example.demo.models.entity.Viaje;
import com.example.demo.models.service.ViajeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/viajes")
public class ViajeController {

    @Autowired
    private ViajeServiceImpl viajeService;

    @PostMapping
    public ResponseEntity<Viaje> crearViaje(@RequestBody Viaje viaje) {
        Viaje viajeCreado = viajeService.crearViaje(viaje);
        return ResponseEntity.status(HttpStatus.CREATED).body(viajeCreado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Viaje> buscarViaje(@PathVariable Long id) {
        Viaje viaje = viajeService.buscarViaje(id);
        return ResponseEntity.ok(viaje);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Viaje> actualizarViaje(@PathVariable Long id, @RequestBody Viaje viaje) {
        Viaje viajeActualizado = viajeService.actualizarViaje(id, viaje);
        return ResponseEntity.ok(viajeActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarViaje(@PathVariable Long id) {
        viajeService.eliminarViaje(id);
        return ResponseEntity.noContent().build();
    }

}
