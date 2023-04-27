package com.example.demo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Socio;

public interface ISocioDao extends JpaRepository<Socio, Long>{

}
