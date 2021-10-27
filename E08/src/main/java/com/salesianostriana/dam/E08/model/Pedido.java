package com.salesianostriana.dam.E08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    private String producto;
    private Timestamp fecha;

    @ManyToOne
    private Cliente cliente;

    public Pedido(String producto, Timestamp fecha) {
        this.producto = producto;
        this.fecha = fecha;
    }

    public Pedido(String producto, Timestamp fecha, Cliente cliente) {
        this.producto = producto;
        this.fecha = fecha;
        this.cliente = cliente;
    }
}
