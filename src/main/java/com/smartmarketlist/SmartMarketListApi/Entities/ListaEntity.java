package com.smartmarketlist.SmartMarketListApi.Entities;

public class ListaEntity {
	
	private String name;
	private Integer id;
	private UserEntity user;
	
	
	public ListaEntity() {
	
	}


	public ListaEntity(String name, Integer id, UserEntity user) {
		
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


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public UserEntity getUser() {
		return user;
	}


	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	
	
	
	

}
