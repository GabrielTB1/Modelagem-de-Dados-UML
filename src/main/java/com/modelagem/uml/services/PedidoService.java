package com.modelagem.uml.services;

import java.util.Optional;

import com.modelagem.uml.domain.Pedido;
import com.modelagem.uml.repositories.PedidoRepository;
import com.modelagem.uml.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
        }

}
