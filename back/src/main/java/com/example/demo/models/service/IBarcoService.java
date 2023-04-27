package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Barco;

public interface IBarcoService {

	public List<Barco> findAll();
	
	public void save(Barco barco);
	
	public Barco findOne(Long id);
	
}
