package com.pantrymanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pantrymanager.domain.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer> {

}
