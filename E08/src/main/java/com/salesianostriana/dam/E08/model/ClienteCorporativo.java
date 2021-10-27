package com.salesianostriana.dam.E08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class ClienteCorporativo extends Cliente{

    @ManyToOne()
    private Empleado empleado;

    public ClienteCorporativo(String nombre, String apellidos, String direccion, Empleado empleado) {
        super(nombre, apellidos, direccion);
        this.empleado = empleado;
    }

}
