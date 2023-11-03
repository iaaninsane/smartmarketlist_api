package com.smartmarketlist.SmartMarketListApi.Entities;



public class ListaProdutosEntity {
	
	

	private Long id;
	private String name;
	private UserEntity userEntity;
	
	
	public ListaProdutosEntity() {
	
	}


	public ListaProdutosEntity(String name, Long id, UserEntity user) {
		
		this.name = name;
		this.id = id;
		this.userEntity = user;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public UserEntity getUser() {
		return userEntity;
	}


	public void setUser(UserEntity user) {
		this.userEntity = user;
	}
	
	
	
	
	

}
