package org.amazon.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product save(Product product){
        return (Product) productRepository.save(product);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Optional<Product> findById(int id){
        return productRepository.findById(id);
    }

    public void deleteById(int id){
        productRepository.deleteById(id);
    }
}
