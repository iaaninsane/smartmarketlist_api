package com.smartmarketlist.SmartMarketListApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartmarketlist.SmartMarketListApi.Entities.ProdutoEntity;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity,Long> {

}
