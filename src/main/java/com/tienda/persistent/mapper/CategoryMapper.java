package com.tienda.persistent.mapper;

import com.tienda.domain.dto.Category;
import com.tienda.persistent.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "productos", target = "products")
    })
    Category toCategory(Categoria categoria);

    List<Category> toCategories( List<Categoria> categorias);

    @InheritInverseConfiguration
    //@Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
