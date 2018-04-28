package com.pantrymanager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pantrymanager.domain.Item;
import com.pantrymanager.domain.Product;
import com.pantrymanager.exception.ObjectNotFoundException;
import com.pantrymanager.repositories.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository repo;
	
	public Item buscar(Integer id) {
		Optional<Item> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Product.class.getName()));

	}

	public Item insert(Item obj) {
		obj.setId(null);
		return repo.save(obj);
		
	}
}
