package com.smartmarketlist.SmartMarketListApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smartmarketlist.SmartMarketListApi.Entities.UserEntity;
import com.smartmarketlist.SmartMarketListApi.Enums.TypeUser;
import com.smartmarketlist.SmartMarketListApi.Repositories.UserRepository;

@SpringBootApplication
public class SmartMarketListApiApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SmartMarketListApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		UserEntity usuario1 = new UserEntity(null, "João Lacerda", "9985221147", "joaolacerda@gmail.com",TypeUser.PREMIUM_USER);
		
		userRepository.save(usuario1);
	}

	
	
}
