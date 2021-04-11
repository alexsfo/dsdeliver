package com.alexsandro.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsandro.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
