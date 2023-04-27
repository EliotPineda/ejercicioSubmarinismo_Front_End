package com.example.demo.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IBarcoDao;
import com.example.demo.models.entity.Barco;

@Service
public class BarcoServiceImpl {

    @Autowired
    private IBarcoDao barcoDao;

    public Barco crearBarco(Barco barco) {
        return barcoDao.save(barco);
    }

    public Barco buscarBarco(Long id) {
        return barcoDao.findById(id).orElse(null);
    }

    public Barco actualizarBarco(Long id, Barco barcoActualizado) {
        Barco barcoExistente = buscarBarco(id);
        if (barcoExistente != null) {
            barcoExistente.setNombre(barcoActualizado.getNombre());
            barcoExistente.setMatricula(barcoActualizado.getMatricula());
            barcoExistente.setNumAmarre(barcoActualizado.getNumAmarre());
            barcoExistente.setCuota(barcoActualizado.getCuota());
            return barcoDao.save(barcoExistente);
        }
        return null;
    }

    public void eliminarBarco(Long id) {
        barcoDao.deleteById(id);
    }

}