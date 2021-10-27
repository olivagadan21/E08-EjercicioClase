package com.salesianostriana.dam.E08.service;

import com.salesianostriana.dam.E08.model.ClienteCorporativo;
import com.salesianostriana.dam.E08.repos.ClienteCorporativoRepository;
import com.salesianostriana.dam.E08.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ClienteCorporativoService extends BaseService<ClienteCorporativo, Long, ClienteCorporativoRepository> {

    public ClienteCorporativoService(ClienteCorporativoRepository repo) {
        super(repo);
    }

}
