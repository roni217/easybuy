package com.pantrymanager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pantrymanager.domain.Product;
import com.pantrymanager.exception.ObjectNotFoundException;
import com.pantrymanager.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public Product buscar(Integer id) {
		Optional<Product> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Product.class.getName()));

	}

	public Product insert(Product obj) {
		obj.setId(null);
		return repo.save(obj);
		
	}
}
