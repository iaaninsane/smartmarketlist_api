package com.smartmarketlist.SmartMarketListApi.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product_list")
public class ListaProdutosEntity {
	
	private Double id;
	private String name;
	private UserEntity user;
	
	
	public ListaProdutosEntity() {
	
	}


	public ListaProdutosEntity(String name, Double id, UserEntity user) {
		
		this.name = name;
		this.id = id;
		this.user = user;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getId() {
		return id;
	}


	public void setId(Double id) {
		this.id = id;
	}


	public UserEntity getUser() {
		return user;
	}


	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	
	
	
	

}
