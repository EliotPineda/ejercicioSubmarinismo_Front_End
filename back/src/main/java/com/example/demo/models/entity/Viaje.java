package com.example.demo.models.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;

@Entity
@Table(name = "VIAJES")
public class Viaje {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VIAJE_ID")
	private Long id;
	
	@Column(name ="FECHA_SALIDA")
	private LocalDate fechaSalida;
	
	@Column(name = "HORA_SALIDA")
	private LocalTime horaSalida;
	
	@Column(name = "DESTINO")
	private String destino;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BARCO_ID")
	private Barco barco;
	
	@OneToOne(mappedBy = "viaje", cascade = CascadeType.ALL)
	private Patron patron;
	
	public Viaje() {
		
	}

	public Viaje(Long id, LocalDate fechaSalida, LocalTime horaSalida, String destino, Barco barco) {
		this.id = id;
		this.fechaSalida = fechaSalida;
		this.horaSalida = horaSalida;
		this.destino = destino;
		this.barco = barco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public LocalTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Viaje [id=" + id + ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida + ", destino="
				+ destino + "]";
	}
	
	
	
}
