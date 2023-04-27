package com.example.demo.models.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class ViajeDTO {
	
	private Long id;
	
	private LocalDate fechaSalida;
	
	private LocalTime horaSalida;
	
	private String destino;
	
	private Long barcoId;

	public ViajeDTO() {
		
	}

	public ViajeDTO(Long id, LocalDate fechaSalida, LocalTime horaSalida, String destino, Long barcoId) {
		this.id = id;
		this.fechaSalida = fechaSalida;
		this.horaSalida = horaSalida;
		this.destino = destino;
		this.barcoId = barcoId;
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

	public Long getBarcoId() {
		return barcoId;
	}

	public void setBarcoId(Long barcoId) {
		this.barcoId = barcoId;
	}
	
}