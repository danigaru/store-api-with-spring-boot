package com.tienda.domain.repository;

import com.tienda.domain.dto.Product;

import java.util.List;
import java.util.Optional;

public interface IProductRepository {

    List<Product> getAll();

    Optional<List<Product>> getByCategory(int categoryId);

    Optional<Product> getProduct(int productId);

    Product save(Product product);

    void delete(int productId);

}
