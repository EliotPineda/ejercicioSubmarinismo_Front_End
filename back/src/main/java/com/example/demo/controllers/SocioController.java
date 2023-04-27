package com.example.demo.controllers;

import com.example.demo.models.dao.ISocioDao;
import com.example.demo.models.entity.Socio;
import com.example.demo.models.service.SocioServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200/")
public class SocioController {

    @Autowired
    private ISocioDao socioService;

    @PostMapping("/socios")
    public Socio guardarSocio(@RequestBody Socio socio) {
	        return socioService.save(socio);
    }
    @GetMapping("/socios")
    public List<Socio> listarTodosLosSocios() {
    	return (List<Socio>) socioService.findAll();
    }
    
    @GetMapping("/socios/{id}")
    public ResponseEntity<Optional<Socio>> obtenerSocioPorId(@PathVariable Long id) {
    	Optional<Socio> socio = socioService.findById(id);
		return ResponseEntity.ok(socio);
    }
    
    @PutMapping("/socios/{id}")
    public ResponseEntity<Socio> actualizarSocio(@PathVariable Long id, @RequestBody Socio socioActualizado) {
        Optional<Socio> socio = socioService.findById(id);
        if (socio.isPresent()) {
            Socio socioExistente = socio.get();
            socioExistente.setNombre(socioActualizado.getNombre());
            socioExistente.setApellidos(socioActualizado.getApellidos());
            socioExistente.setDNI(socioActualizado.getDNI());
            Socio socioActualizadoEnBD = socioService.save(socioExistente);
            return new ResponseEntity<>(socioActualizadoEnBD, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/socios/{id}")
    public ResponseEntity<Void> eliminarSocio(@PathVariable Long id) {
        socioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
