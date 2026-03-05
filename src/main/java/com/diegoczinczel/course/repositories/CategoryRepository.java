package com.diegoczinczel.course.repositories;

import com.diegoczinczel.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
