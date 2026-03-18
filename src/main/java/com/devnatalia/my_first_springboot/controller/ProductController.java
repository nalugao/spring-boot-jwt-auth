package com.devnatalia.my_first_springboot.controller;

import com.devnatalia.my_first_springboot.exceptions.ResourceNotFoundException;
import com.devnatalia.my_first_springboot.model.Product;
import com.devnatalia.my_first_springboot.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> listingProducts(){
        return  productService.listingProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findProduct(@PathVariable Long id) {
        Product product = productService.findById(id);
            return ResponseEntity.ok(product);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct((product));
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent()
                .build();    }
}
