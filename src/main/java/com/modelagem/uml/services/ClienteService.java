package com.modelagem.uml.services;

import java.util.Optional;

import com.modelagem.uml.domain.Cliente;
import com.modelagem.uml.repositories.ClienteRepository;
import com.modelagem.uml.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
        }

}
