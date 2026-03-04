package com.diegoczinczel.course.repositories;

import com.diegoczinczel.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
