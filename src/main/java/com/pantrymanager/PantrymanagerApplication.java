package com.pantrymanager;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pantrymanager.domain.Category;
import com.pantrymanager.domain.Item;
import com.pantrymanager.domain.Product;
import com.pantrymanager.repositories.CategoryRepository;
import com.pantrymanager.repositories.ItemRepository;
import com.pantrymanager.repositories.ProductRepository;

@SpringBootApplication
public class PantrymanagerApplication implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PantrymanagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "cereals");  
		categoryRepository.saveAll(Arrays.asList(cat1));
		
		Product prod1 = new Product(null, "Flour", 5, cat1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Item itm1 = new Item(null, sdf.parse("30/09/2018"), prod1 );
		Item itm2 = new Item(null, sdf.parse("30/05/2018"), prod1 );
		
		prod1.getItens().addAll(Arrays.asList(itm1,itm2));
		
		productRepository.saveAll(Arrays.asList(prod1));
		
		itemRepository.saveAll(Arrays.asList(itm1, itm2));
	}
}
