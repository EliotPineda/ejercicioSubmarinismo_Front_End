package com.example.demo.models.entity;

import java.util.ArrayList;
import java.util.List;



import jakarta.persistence.*;

@Entity
@Table(name = "BARCOS")
public class Barco {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BARCO_ID")
	private Long id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "MATRICULA")
	private String matricula;
	
	@Column(name = "NUM_AMARRE")
	private int numAmarre;
	
	@Column(name = "CUOTA")
	private double cuota;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SOCIO_ID")
	private Socio socio;
	
	@OneToOne(mappedBy = "barco", fetch = FetchType.LAZY)
	private Patron patron;
	
	@OneToMany(mappedBy = "barco", cascade = CascadeType.ALL)
	private List<Viaje> viajes = new ArrayList<>();
	
	public Barco() {
		
	}

	public Barco(Long id, String nombre, String matricula, int numAmarre, double cuota, Socio socio, Patron patron) {
		this.id = id;
		this.nombre = nombre;
		this.matricula = matricula;
		this.numAmarre = numAmarre;
		this.cuota = cuota;
		this.socio = socio;
		this.patron = patron;
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumAmarre() {
		return numAmarre;
	}

	public void setNumAmarre(int numAmarre) {
		this.numAmarre = numAmarre;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "Barco [id=" + id + ", nombre=" + nombre + ", matricula=" + matricula + ", numAmarre=" + numAmarre
				+ ", cuota=" + cuota + "]";
	}
	

}
