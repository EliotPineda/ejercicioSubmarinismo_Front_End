package com.example.demo.models.DTO;

public class BarcoDTO {
	
	private Long id;
	private String nombre;
	private String matricula;
	private int numAmarre;
	private double cuota;
	private Long socioId;
	private Long patronId;
	
	public BarcoDTO() {
		
	}
	
	public BarcoDTO(Long id, String nombre, String matricula, int numAmarre, double cuota, Long socioId, Long patronId) {
		this.id = id;
		this.nombre = nombre;
		this.matricula = matricula;
		this.numAmarre = numAmarre;
		this.cuota = cuota;
		this.socioId = socioId;
		this.patronId = patronId;
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
	public Long getSocioId() {
		return socioId;
	}
	public void setSocioId(Long socioId) {
		this.socioId = socioId;
	}
	public Long getPatronId() {
		return patronId;
	}
	public void setPatronId(Long patronId) {
		this.patronId = patronId;
	}
	
}