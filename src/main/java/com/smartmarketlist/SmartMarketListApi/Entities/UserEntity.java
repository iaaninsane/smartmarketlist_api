package com.smartmarketlist.SmartMarketListApi.Entities;

public class UserEntity {
	
	
	private String name;
	private Integer id;
	private String cpf;
	private String email;
	private String pw;
	
	public UserEntity() {
		
	}

	public UserEntity(String name, Integer id, String cpf, String email, String pw) {
		
		this.name = name;
		this.id = id;
		this.cpf = cpf;
		this.email = email;
		this.pw = pw;
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

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
	
	
	

}
