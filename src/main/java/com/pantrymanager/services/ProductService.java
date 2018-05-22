package com.pantrymanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.pantrymanager.domain.Product;
import com.pantrymanager.exception.ObjectNotFoundException;
import com.pantrymanager.repositories.ProductRepository;
import com.pantrymanager.services.exception.DataIntegrityException;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public Product find(Integer id) {
		Optional<Product> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Product.class.getName()));

	}

	public Product insert(Product obj) {
		obj.setId(null);
		return repo.save(obj);
		
	}

	public Product update(Product obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possivel excluir uma categoria que possui Itens");
		}
	}

	public List<Product> findAll() {
		return repo.findAll();
	}
}
