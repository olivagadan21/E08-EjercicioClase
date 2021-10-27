package com.salesianostriana.dam.E08.service;

import com.salesianostriana.dam.E08.model.Empleado;
import com.salesianostriana.dam.E08.repos.EmpleadoRepository;
import com.salesianostriana.dam.E08.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService extends BaseService<Empleado, Long, EmpleadoRepository> {

    public EmpleadoService(EmpleadoRepository repo) {
        super(repo);
    }

}
