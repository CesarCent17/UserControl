package com.usercontrol.UserControl.models;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private long id;

    public User() {
    }

    public User(long id, String nombre, String apellido, String email, LocalDate fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNac = fechaNac;
    }

    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNac;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }


}
