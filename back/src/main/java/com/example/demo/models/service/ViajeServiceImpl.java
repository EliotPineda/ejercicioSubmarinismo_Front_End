package com.example.demo.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IViajeDao;
import com.example.demo.models.entity.Viaje;

@Service
public class ViajeServiceImpl {

    @Autowired
    private IViajeDao viajeDao;

    public Viaje crearViaje(Viaje viaje) {
        return viajeDao.save(viaje);
    }

    public Viaje buscarViaje(Long id) {
        Optional<Viaje> optionalViaje = viajeDao.findById(id);
        return optionalViaje.orElse(null);
    }

    public Viaje actualizarViaje(Long id, Viaje viaje) {
        viaje.setId(id);
        return viajeDao.save(viaje);
    }

    public void eliminarViaje(Long id) {
        viajeDao.deleteById(id);
    }

    public List<Viaje> buscarTodos() {
        return (List<Viaje>) viajeDao.findAll();
    }

}