package com.example.demo.models.service;

import com.example.demo.models.dao.IPatronDao;
import com.example.demo.models.entity.Patron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatronServiceImpl {

    @Autowired
    private IPatronDao patronDao;

    public Patron crearPatron(Patron patron) {
        return patronDao.save(patron);
    }

    public Patron buscarPatron(Long id) {
        return patronDao.findById(id).orElse(null);
    }

    public Patron actualizarPatron(Long id, Patron patronActualizado) {
    	Patron patronExistente = buscarPatron(id);
        if (patronExistente != null) {
            patronExistente.setNombre(patronActualizado.getNombre());
            patronExistente.setApellidos(patronActualizado.getApellidos());
            patronExistente.setDNI(patronActualizado.getDNI());
            return patronDao.save(patronExistente);
        }
        return null;
    }

    public void eliminarPatron(Long id) {
        patronDao.deleteById(id);
    }

}