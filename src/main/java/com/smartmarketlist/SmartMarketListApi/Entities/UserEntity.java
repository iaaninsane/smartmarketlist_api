package com.smartmarketlist.SmartMarketListApi.Entities;


import com.smartmarketlist.SmartMarketListApi.Enums.TypeUser;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	private String email;
	private TypeUser typeUser;
	
	
	public UserEntity() {
		
	}

	public UserEntity(Long id, String name, String cpf, String email,TypeUser typeUser) {
		
		this.name = name;
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.typeUser = typeUser;
		
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public TypeUser getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(TypeUser typeUser) {
		this.typeUser = typeUser;
	}


	
	public void criaLista() {
		
	};
	
	
	
	
	

}
