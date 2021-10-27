package com.salesianostriana.dam.E08.service;

import com.salesianostriana.dam.E08.model.ClienteIndividual;
import com.salesianostriana.dam.E08.repos.ClienteIndividualRepository;
import com.salesianostriana.dam.E08.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ClienteIndividualService extends BaseService<ClienteIndividual, Long, ClienteIndividualRepository> {

    public ClienteIndividualService(ClienteIndividualRepository repo) {
        super(repo);
    }


}
