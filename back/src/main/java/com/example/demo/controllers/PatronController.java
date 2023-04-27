package com.example.demo.controllers;

import com.example.demo.models.entity.Patron;
import com.example.demo.models.service.PatronServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patrones")
public class PatronController {

    @Autowired
    private PatronServiceImpl patronService;

    @PostMapping
    public ResponseEntity<Patron> crearPatron(@RequestBody Patron patron) {
        Patron patronCreado = patronService.crearPatron(patron);
        return ResponseEntity.status(HttpStatus.CREATED).body(patronCreado);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patron> buscarPatron(@PathVariable Long id) {
        Patron patron = patronService.buscarPatron(id);
        return ResponseEntity.ok(patron);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Patron> actualizarPatron(@PathVariable Long id, @RequestBody Patron patron) {
        Patron patronActualizado = patronService.actualizarPatron(id, patron);
        return ResponseEntity.ok(patronActualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPatron(@PathVariable Long id) {
        patronService.eliminarPatron(id);
        return ResponseEntity.noContent().build();
    }

}
