package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Patron;

public interface IPatronService {

	public List<Patron> findAll();
	
	public void save(Patron patron);
	
	public Patron findOne(Long id);
	
}
