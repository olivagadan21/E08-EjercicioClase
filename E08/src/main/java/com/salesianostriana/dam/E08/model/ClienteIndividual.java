package com.salesianostriana.dam.E08.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class ClienteIndividual extends Cliente {

    public ClienteIndividual(String nombre, String apellidos, String direccion) {
        super(nombre, apellidos, direccion);
    }

}
