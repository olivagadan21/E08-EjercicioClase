package com.salesianostriana.dam.E08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Empleado {

    @Id
    @GeneratedValue
    private Long id;

    private String dni;
    private double sueldo;

    public Empleado(String dni, double sueldo) {
        this.dni = dni;
        this.sueldo = sueldo;
    }

}
