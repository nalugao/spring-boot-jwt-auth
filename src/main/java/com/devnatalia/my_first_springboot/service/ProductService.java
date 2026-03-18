package com.devnatalia.my_first_springboot.service;

import com.devnatalia.my_first_springboot.exceptions.ResourceNotFoundException;
import com.devnatalia.my_first_springboot.model.Product;
import com.devnatalia.my_first_springboot.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> listingProducts() {
        return productRepository.findAll();
    }

    public Product findById(Long id){
        return  productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product "+id+" not found"));
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        if(!productRepository.existsById(id)) {
            throw  new ResourceNotFoundException("Product "+id+" not found");
        }
        productRepository.deleteById(id);
    }
}
