package com.example.demo.controllers;

import com.example.demo.models.entity.Barco;
import com.example.demo.models.service.BarcoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/barcos")
public class BarcoController {

    @Autowired
    private BarcoServiceImpl barcoService;

    @PostMapping
    public ResponseEntity<Barco> crearBarco(@RequestBody Barco barco) {
        Barco barcoCreado = barcoService.crearBarco(barco);
        return ResponseEntity.status(HttpStatus.CREATED).body(barcoCreado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Barco> buscarBarco(@PathVariable Long id) {
        Barco barco = barcoService.buscarBarco(id);
        return ResponseEntity.ok(barco);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Barco> actualizarBarco(@PathVariable Long id, @RequestBody Barco barco) {
        Barco barcoActualizado = barcoService.actualizarBarco(id, barco);
        return ResponseEntity.ok(barcoActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarBarco(@PathVariable Long id) {
        barcoService.eliminarBarco(id);
        return ResponseEntity.noContent().build();
    }

}
