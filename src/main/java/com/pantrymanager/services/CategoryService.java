package com.pantrymanager.services;

import java.util.List;
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

	public Category find(Integer id) {
		Optional<Category> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Category.class.getName()));

	}

	public Category insert(Category obj) {
		obj.setId(null);
		return repo.save(obj);

	}

	public Category update(Category obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}

	public List<Category> findAll() {
		return repo.findAll();
	}
}
