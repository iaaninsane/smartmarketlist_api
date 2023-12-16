package com.smartmarketlist.SmartMarketListApi.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item_da_lista")
public class ItemDaListaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer qtd; 
	
	private ProdutoEntity produtoEntity;
	
	private ListaProdutosEntity listaProdutosEntity;

	
	
	public ItemDaListaEntity() {
		
	}


	public ItemDaListaEntity(Long id, Integer qtd, ProdutoEntity produtoEntity,
			ListaProdutosEntity listaProdutosEntity) {
		
		this.id = id;
		this.qtd = qtd;
		this.produtoEntity = produtoEntity;
		this.listaProdutosEntity = listaProdutosEntity;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getQtd() {
		return qtd;
	}


	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}


	public ProdutoEntity getProdutoEntity() {
		return produtoEntity;
	}


	public void setProdutoEntity(ProdutoEntity produtoEntity) {
		this.produtoEntity = produtoEntity;
	}


	public ListaProdutosEntity getListaProdutosEntity() {
		return listaProdutosEntity;
	}


	public void setListaProdutosEntity(ListaProdutosEntity listaProdutosEntity) {
		this.listaProdutosEntity = listaProdutosEntity;
	}
	
	
	

}
