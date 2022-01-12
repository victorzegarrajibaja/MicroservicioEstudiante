package com.everis.productos.service;

import com.everis.productos.entity.ProductEntity;
import com.everis.productos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public void remove(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProductEntity getById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

}
