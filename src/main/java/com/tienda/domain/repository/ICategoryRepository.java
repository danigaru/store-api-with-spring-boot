package com.tienda.domain.repository;

import com.tienda.domain.dto.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryRepository {

    List<Category> getAll();

    Optional<Category> getCategory(int categoryId);

    Category save(Category category);

    void delete(int categoryId);

}
