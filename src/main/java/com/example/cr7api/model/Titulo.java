package com.example.cr7api.model;

public class Titulo {
    private Long id;
    private String nombre;
    private int año;
    private String club;

    public Titulo() {}

    public Titulo(Long id, String nombre, int año, String club) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.club = club;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }

    public String getClub() { return club; }
    public void setClub(String club) { this.club = club; }
}
