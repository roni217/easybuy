package com.pantrymanager.domain.dto;

import com.pantrymanager.domain.Category;

public class CategoryDTO {

	
	private Integer id;
	private String description;
	
	public CategoryDTO() {
	}

	public CategoryDTO(Category obj) {
		id = obj.getId();
		description = obj.getDescription();
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
	
	
}
