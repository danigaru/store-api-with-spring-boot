package com.tienda.persistent.crud;

import com.tienda.persistent.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryCrudRepository extends CrudRepository<Categoria, Integer> {
}
