package com.smartmarketlist.SmartMarketListApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartmarketlist.SmartMarketListApi.Entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
