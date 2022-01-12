package com.everis.productos.controller;

import com.everis.productos.entity.ProductEntity;
import com.everis.productos.repository.ProductRepository;
import com.everis.productos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Iterable<ProductEntity> getAll(){
        return productService.getAll();
    }

    @PostMapping("/product")
    public  ProductEntity insert(@RequestBody ProductEntity request){
         return productService.save(request);
    }

    @GetMapping("/product/{id}")
    public ProductEntity getById(@PathVariable Long id){
         return  productService.getById(id);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        productService.remove(id);
    }
}
