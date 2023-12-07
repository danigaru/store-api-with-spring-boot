package com.tienda.persistent;

import com.tienda.domain.dto.Category;
import com.tienda.domain.repository.ICategoryRepository;
import com.tienda.persistent.crud.ICategoryCrudRepository;
import com.tienda.persistent.entity.Categoria;
import com.tienda.persistent.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository implements ICategoryRepository {

    @Autowired
    private ICategoryCrudRepository iCategoryCrudRepository;

    @Autowired
    private CategoryMapper mapper;

    @Override
    public List<Category> getAll() {
        return mapper.toCategories((List<Categoria>) iCategoryCrudRepository.findAll());
    }

    @Override
    public Optional<Category> getCategory(int categoryId) {
        return Optional.empty();
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public void delete(int categoryId) {

    }
}
