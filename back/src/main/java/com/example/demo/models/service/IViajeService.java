package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Viaje;

public interface IViajeService {

	public List<Viaje> findAll();
	
	public void save(Viaje viaje);
	
	public Viaje findOne(Long id);
	
}
