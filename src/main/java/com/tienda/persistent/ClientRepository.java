package com.tienda.persistent;

import com.tienda.domain.dto.Client;
import com.tienda.domain.repository.IClientRepository;
import com.tienda.persistent.crud.ClientCrudRepository;
import com.tienda.persistent.entity.Cliente;
import com.tienda.persistent.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository implements IClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    @Autowired
    private ClientMapper mapper;

    @Override
    public List<Client> getAll() {
        return mapper.toClients ((List<Cliente>) clientCrudRepository.findAll());
    }

    @Override
    public Optional<Client> getClient(String clientId) {
        return clientCrudRepository.findById(clientId).map( cliente -> mapper.toClient(cliente));
    }

    @Override
    public Client save(Client client) {
        return mapper.toClient(clientCrudRepository.save(mapper.toCliente(client)));
    }

    @Override
    public void delete(String clientId) {
        clientCrudRepository.deleteById(clientId);
    }

}
