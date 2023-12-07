package com.tienda.persistent.crud;

import com.tienda.persistent.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Cliente, String> {
}
