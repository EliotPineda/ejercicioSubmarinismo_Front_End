package com.example.demo.models.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.ISocioDao;
import com.example.demo.models.entity.Socio;

@Service
public class SocioServiceImpl {

    @Autowired
    private ISocioDao socioDao;

    public Socio crearSocio(Socio socio) {
        return socioDao.save(socio);
    }

    public Socio buscarSocio(Long id) {
        Optional<Socio> socioOptional = socioDao.findById(id);
        if (socioOptional.isPresent()) {
            return socioOptional.get();
        } else {
            throw new RuntimeException("No se encontró ningún socio con el identificador " + id);
        }
    }

    public Socio actualizarSocio(Long id, Socio socio) {
        Optional<Socio> socioOptional = socioDao.findById(id);
        if (socioOptional.isPresent()) {
            Socio socioExistente = socioOptional.get();
            socioExistente.setNombre(socio.getNombre());
            socioExistente.setApellidos(socio.getApellidos());
            socioExistente.setDNI(socio.getDNI());
            socioExistente.setBarcos(socio.getBarcos());
            return socioDao.save(socioExistente);
        } else {
            throw new RuntimeException("No se encontró ningún socio con el identificador " + id);
        }
    }

    public void eliminarSocio(Long id) {
        socioDao.deleteById(id);
    }

}