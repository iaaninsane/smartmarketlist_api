package com.smartmarketlist.SmartMarketListApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartmarketlist.SmartMarketListApi.Entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
