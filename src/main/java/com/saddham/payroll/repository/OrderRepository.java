package com.saddham.payroll.repository;

import com.saddham.payroll.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
