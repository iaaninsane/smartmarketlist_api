package com.smartmarketlist.SmartMarketListApi.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_lista")
public class ListaProdutosEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity userEntity;
	
	@OneToMany(mappedBy = "listaProdutosEntity")
	private List<ItemDaListaEntity> itemDaListaEntity = new ArrayList<>();
	
	
	public ListaProdutosEntity() {
	
	}


	public ListaProdutosEntity(Long id, String name, UserEntity user) {
		
		this.id = id;
		this.name = name;
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


	public UserEntity getUserEntity() {
		return userEntity;
	}


	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}


	public List<ItemDaListaEntity> getItemDaListaEntity() {
		return itemDaListaEntity;
	}
	
	
	
	
	

}
