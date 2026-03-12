package com.diegoczinczel.course.repositories;

import com.diegoczinczel.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
