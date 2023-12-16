package com.smartmarketlist.SmartMarketListApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartmarketlist.SmartMarketListApi.Entities.ItemDaListaEntity;

public interface ItemDaListaRepository extends JpaRepository<ItemDaListaEntity,Long> {
	
	
}
