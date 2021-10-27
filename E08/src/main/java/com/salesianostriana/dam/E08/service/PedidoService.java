package com.salesianostriana.dam.E08.service;

import com.salesianostriana.dam.E08.model.Pedido;
import com.salesianostriana.dam.E08.repos.PedidoRepository;
import com.salesianostriana.dam.E08.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PedidoService extends BaseService<Pedido, Long, PedidoRepository> {

    public PedidoService(PedidoRepository repo) {
        super(repo);
    }

}
