package com.orangeteam.auc.rep;

import com.orangeteam.auc.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
