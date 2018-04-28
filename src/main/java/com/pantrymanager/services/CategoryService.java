package com.pantrymanager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pantrymanager.domain.Category;
import com.pantrymanager.exception.ObjectNotFoundException;
import com.pantrymanager.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;
	
	public Category buscar(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Category.class.getName()));

	}

	public Category insert(Category obj) {
		obj.setId(null);
		return repo.save(obj);
		
	}
}
