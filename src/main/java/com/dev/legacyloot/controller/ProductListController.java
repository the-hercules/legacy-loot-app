package com.dev.legacyloot.controller;

import com.dev.legacyloot.repository.ProductListRepository;
import com.dev.legacyloot.service.ProductListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dev.legacyloot.model.ProductList;

import java.util.List;

@RestController
public class ProductListController {
    @Autowired
    private ProductListService productListService;

    @GetMapping("/getProductList")
    public List<ProductList> getProductList() {
        return productListService.getProductList();
    }
}

