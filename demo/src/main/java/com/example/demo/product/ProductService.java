package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // 상품 조회
    public Product findProduct(int id) {
        return productRepository.findProduct(id);
    }

    // 상품 등록
    public void saveProduct(Product product) {
        productRepository.save(product);
    }
    
}
