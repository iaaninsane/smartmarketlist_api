package com.smartmarketlist.SmartMarketListApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartmarketlist.SmartMarketListApi.Entities.ListaProdutosEntity;

public interface ListaProdutosRepository extends JpaRepository<ListaProdutosEntity,Long> {
	
	
}
