package com.pantrymanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pantrymanager.domain.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Integer> {

}
