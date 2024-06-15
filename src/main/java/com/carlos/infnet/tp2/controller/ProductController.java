package com.carlos.infnet.tp2.controller;

import org.springframework.web.bind.annotation.*;

import com.carlos.infnet.tp2.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    List<Product> productList = new ArrayList<>();
    int uniqueId = 0;

    int getUniqueId() {
        return uniqueId++;
    }

    @GetMapping("/list")
    public List<Product> listProducts() {
        return productList;
    }

    @GetMapping("/list/{id}")
    public Product listProduct(@PathVariable int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody Map<String, String> requestParams) {
        Product product = new Product(getUniqueId(), requestParams.get("name"), Double.parseDouble(requestParams.get("value")), requestParams.get("description"));
        productList.add(product);
        return "Product added successfully!";
    }

    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                if (product.getName() != null)
                    productList.get(i).setName(product.getName());

                if (product.getValue() > 0)
                    productList.get(i).setValue(product.getValue());

                if (product.getDescription() != null)
                    productList.get(i).setDescription(product.getDescription());

                return "Product updated successfully!";
            }
        }
        return "Product not found";
    }

    @DeleteMapping("/remove/{id}")
    public String removeProduct(@PathVariable int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                return "Product removed successfully!";
            }
        }
        return "Product not found";
    }
}