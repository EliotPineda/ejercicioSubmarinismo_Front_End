package com.example.demo.models.DTO;

public class PatronDTO {

    private Long id;
    private String nombre;
    private String apellidos;
    private String DNI;

    public PatronDTO() {
    }

    public PatronDTO(Long id, String nombre, String apellidos, String DNI) {
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "PatronDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}