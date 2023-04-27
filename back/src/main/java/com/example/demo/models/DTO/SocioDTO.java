package com.example.demo.models.DTO;

import java.util.List;

public class SocioDTO {
    
    private Long id;
    private String nombre;
    private String apellidos;
    private String DNI;
    private List<Long> barcosIds;
    
    public SocioDTO() {}
    
    public SocioDTO(Long id, String nombre, String apellidos, String DNI, List<Long> barcosIds) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.barcosIds = barcosIds;
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
    
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public List<Long> getBarcosIds() {
        return barcosIds;
    }
    
    public void setBarcosIds(List<Long> barcosIds) {
        this.barcosIds = barcosIds;
    }
}
