package com.dev.legacyloot.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
@Data
@Document(collection = "allProducts")
public class ProductList {
    @Id
    private Integer productId;
    private String productName;
}
