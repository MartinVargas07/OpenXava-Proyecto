package com.tuempresa.easycar.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;

    @Required
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Required
    private double total;

    @ManyToOne(optional = false)
    @ReferenceView("Simple")
    private Cliente cliente;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    @ListProperties("vehiculo.marca, vehiculo.modelo, cantidad, precioTotal")

    public void agregarItem(Vehiculo vehiculo, int cantidad) {
        ItemVenta item = new ItemVenta();
        item.setVehiculo(vehiculo);
        item.setCantidad(cantidad);
        item.setPrecioTotal(vehiculo.getPrecio() * cantidad);
        item.setVenta(this);

    }



    // Getters y setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}