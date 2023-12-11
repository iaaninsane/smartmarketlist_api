package com.smartmarketlist.SmartMarketListApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smartmarketlist.SmartMarketListApi.Entities.ProdutoEntity;
import com.smartmarketlist.SmartMarketListApi.Entities.UserEntity;
import com.smartmarketlist.SmartMarketListApi.Enums.TypeUser;
import com.smartmarketlist.SmartMarketListApi.Repositories.ProdutoRepository;
import com.smartmarketlist.SmartMarketListApi.Repositories.UserRepository;

@SpringBootApplication
public class SmartMarketListApiApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SmartMarketListApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		UserEntity usuario1 = new UserEntity(null, "João Lacerda", "9985221147", "joaolacerda@gmail.com",TypeUser.FREE_USER);
		
		userRepository.save(usuario1);
		
		
		ProdutoEntity Produto1 = new ProdutoEntity(null, "Açucar");
		
		produtoRepository.save(Produto1);
	}

	
	
}
