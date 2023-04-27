package com.example.demo.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PATRONES")
public class Patron {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PATRON_ID")
	private Long id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDOS")
	private String apellidos;
	
	@Column(name = "DNI")
	private String DNI;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "BARCO_ID")
	private Barco barco;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "VIAJE_ID")
	private Viaje viaje;
	
	public Patron() {
		
	}

	public Patron(Long id, String nombre, String apellidos, String dNI) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
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

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	@Override
	public String toString() {
		return "Patron [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + "]";
	}
	
	
	
}
