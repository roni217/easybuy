package com.pantrymanager.domain.dto;

import com.pantrymanager.domain.Category;
import com.pantrymanager.domain.Product;

public class ProductDTO  {
	
	private Integer id;
	private String description;
	private Integer idealQuantity;
	private Category category;
	
	public ProductDTO(){
	}
			
	public ProductDTO(Product obj){
		id = obj.getId();
		description = obj.getDescription();
		idealQuantity = obj.getIdealQuantity();
		category = obj.getCategory();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIdealQuantity() {
		return idealQuantity;
	}

	public void setIdealQuantity(Integer idealQuantity) {
		this.idealQuantity = idealQuantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}
