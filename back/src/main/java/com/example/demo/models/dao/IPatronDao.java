package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Patron;

public interface IPatronDao extends CrudRepository<Patron, Long>{

}
