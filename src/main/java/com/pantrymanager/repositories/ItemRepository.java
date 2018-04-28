package com.pantrymanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pantrymanager.domain.Item;

@Repository
public interface ItemRepository  extends JpaRepository<Item, Integer> {

}
