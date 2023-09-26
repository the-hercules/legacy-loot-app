package com.dev.legacyloot.service;

import com.dev.legacyloot.repository.ProductListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.dev.legacyloot.model.ProductList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductListService {
    @Autowired
    private ProductListRepository productListRepository;

    public List<ProductList> getProductList() {
        return productListRepository.findAll();
    }
}
