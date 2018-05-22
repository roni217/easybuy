package com.pantrymanager.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pantrymanager.domain.Item;

public class ItemDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	 @JsonFormat(pattern="yyyy-MM-dd")
	private Date expiryDate;
	private Integer productId;
	private String productDescription; 
	
	public ItemDTO(){
	}
	
	public ItemDTO(Item obj){
		id = obj.getId();
		expiryDate = obj.getExpiryDate();
		productId = obj.getProduct().getId();
		productDescription = obj.getProduct().getDescription();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

}
