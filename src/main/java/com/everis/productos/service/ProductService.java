package com.everis.productos.service;

import com.everis.productos.entity.ProductEntity;

public interface ProductService {

    public Iterable<ProductEntity> getAll();

    public ProductEntity save(ProductEntity productEntity);

    public void remove(Long id);

    public ProductEntity getById(Long id);

}
