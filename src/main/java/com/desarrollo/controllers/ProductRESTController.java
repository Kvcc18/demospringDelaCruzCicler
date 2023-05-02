package com.desarrollo.controllers;

import com.desarrollo.entities.Product;
import com.desarrollo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductRESTController {

        @Autowired
        private ProductService productService;

        @GetMapping("/productlist")
        public List<Product> productList(){
            System.out.println("Returning products: ");
            return (List<Product>) productService.listAllProducts();
        }
        @PostMapping( "/newproduct")
        public ResponseEntity<String> saveProduct(@RequestBody Product product) {
            productService.saveProduct(product);
            System.out.println(">>>Save product");
            return new ResponseEntity<>("Producto creado!", HttpStatus.OK);
        }
}
