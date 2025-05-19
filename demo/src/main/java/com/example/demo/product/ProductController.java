package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class ProductController {

    @Autowired
    private ProductService productService;

    // 사용자(화면)가 어떤 요청을 던지면
    // 그에 맞는 로직을 수행 == 서비스한테 시킬거임

    // (특정) 상품 조회
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product findProduct(@PathVariable("id") int id ) {
        System.out.println(id);
        return productService.findProduct(id);
    }

    // 상품 등록
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product) {
        //http://localhost:8081/products?name=handcream 라고 한다면
        // String productName = "handcream"
        System.out.println("POST");
        productService.saveProduct(product);
    }


}
