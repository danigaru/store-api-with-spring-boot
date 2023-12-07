package com.tienda.domain.service;

import com.tienda.domain.dto.Client;
import com.tienda.domain.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService  {

    @Autowired
    private IClientRepository iClientRepository;

    public List<Client> getAll() {
        return iClientRepository.getAll();
    }

    public Optional<Client> getClient(String clientId) {
        return iClientRepository.getClient(clientId);
    }

    public Client save(Client client) {
        return iClientRepository.save(client);
    }

    public Boolean delete(String clientId) {
        return getClient(clientId).map( client -> {
            iClientRepository.delete(clientId);
            return true;
        } ).orElse(false);
    }

}
