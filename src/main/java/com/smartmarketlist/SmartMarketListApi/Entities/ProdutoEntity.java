package com.smartmarketlist.SmartMarketListApi.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class ProdutoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Double id;
	private String name;
	
	
	
	public ProdutoEntity() {
		
	}


	public ProdutoEntity(String name, Double id) {
		
		this.name = name;
		this.id = id;
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
	
	
	
	
	

}
