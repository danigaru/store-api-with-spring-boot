package com.tienda.domain.repository;

import com.tienda.domain.dto.Client;

import java.util.List;
import java.util.Optional;

public interface IClientRepository {

    List<Client> getAll();

    Optional<Client> getClient(String clientId);

    Client save(Client client);

    void delete(String clientId);

}
