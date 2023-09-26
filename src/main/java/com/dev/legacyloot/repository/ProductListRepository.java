package com.dev.legacyloot.repository;
import com.dev.legacyloot.model.ProductList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductListRepository extends MongoRepository<ProductList,Integer>{

}
