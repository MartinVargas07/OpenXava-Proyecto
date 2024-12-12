package com.tuempresa.easycar.modelo;
import javax.persistence.*;

import org.openxava.annotations.*;

@View(name = "Simple", members = "idCliente, nombre")
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;

    @Column(length = 20)
    @Required
    private String nombre;

    @Column(length = 20)
    @Required
    private String correo;

    @Column(length = 10)
    @Required
    private String telefono;

    // Getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}