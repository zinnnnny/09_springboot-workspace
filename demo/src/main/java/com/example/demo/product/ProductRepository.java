package com.example.demo.product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {

    private Map<Integer, Product> db = new HashMap<>();
    private int id = 1;

    // 상품 조회
    public Product findProduct(int idx) {
        return db.get(idx);
    }

    // 상품 등록
    public void save(Product product) {
        System.out.println(product.getName());
        db.put(id++, product);
    }

}
