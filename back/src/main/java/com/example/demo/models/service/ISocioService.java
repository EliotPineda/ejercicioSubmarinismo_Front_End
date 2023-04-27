package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Socio;

public interface ISocioService {

	public List<Socio> findAll();
	
	public void save(Socio socio);
	
	public Socio findOne(Long id);
	
}
