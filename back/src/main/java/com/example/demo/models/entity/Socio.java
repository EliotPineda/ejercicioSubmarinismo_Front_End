package com.example.demo.models.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "SOCIOS")
public class Socio {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SOCIO_ID")
	private Long id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDOS")
	private String apellidos;
	
	@Column(name = "DNI")
	private String DNI;
	
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	@OneToMany(mappedBy = "socio", cascade = CascadeType.ALL)
	private List<Barco> barcos = new ArrayList<>();
	
	public Socio() {
		
	}

	public Socio(Long id, String nombre, String apellidos, String DNI) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public List<Barco> getBarcos() {
		return barcos;
	}

	public void setBarcos(List<Barco> barcos) {
		this.barcos = barcos;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
	
}
