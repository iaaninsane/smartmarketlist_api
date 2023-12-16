package com.smartmarketlist.SmartMarketListApi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smartmarketlist.SmartMarketListApi.Entities.ItemDaListaEntity;
import com.smartmarketlist.SmartMarketListApi.Entities.ListaProdutosEntity;
import com.smartmarketlist.SmartMarketListApi.Entities.ProdutoEntity;
import com.smartmarketlist.SmartMarketListApi.Entities.UserEntity;
import com.smartmarketlist.SmartMarketListApi.Enums.TypeUser;
import com.smartmarketlist.SmartMarketListApi.Repositories.ItemDaListaRepository;
import com.smartmarketlist.SmartMarketListApi.Repositories.ListaProdutosRepository;
import com.smartmarketlist.SmartMarketListApi.Repositories.ProdutoRepository;
import com.smartmarketlist.SmartMarketListApi.Repositories.UserRepository;

@SpringBootApplication
public class SmartMarketListApiApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ListaProdutosRepository listaProdutosRepository;
	
	@Autowired
	private ItemDaListaRepository itemDaListaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SmartMarketListApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		UserEntity usuario1 = new UserEntity(null, "João Lacerda", "9985221147", "joaolacerda@gmail.com",TypeUser.FREE_USER);
		UserEntity usuario2 = new UserEntity(null, "Elvis Presley", "9985229999", "qqcoisa@gmail.com",TypeUser.FREE_USER);
		UserEntity usuario3 = new UserEntity(null, "Batman da Silva", "999999999", "batman@gmail.com",TypeUser.PREMIUM_USER);
		
		userRepository.saveAll(Arrays.asList(usuario1,usuario2,usuario3));
		
		
		ProdutoEntity produto1 = new ProdutoEntity(null, "Açucar");
		ProdutoEntity produto2 = new ProdutoEntity(null, "Massa");
		ProdutoEntity produto3 = new ProdutoEntity(null, "Desinfetante");
		ProdutoEntity produto4 = new ProdutoEntity(null, "Detergente");
	
		produtoRepository.saveAll(Arrays.asList(produto1,produto2,produto3,produto4));
		
		ListaProdutosEntity lista1 = new ListaProdutosEntity(null, "Produtos de Higiene", usuario1);
		ListaProdutosEntity lista2 = new ListaProdutosEntity(null, "Produtos de Cozinha", usuario1);
		ListaProdutosEntity lista3 = new ListaProdutosEntity(null, "cesta básica", usuario2);
		
		listaProdutosRepository.saveAll(Arrays.asList(lista1,lista2,lista3));
		
		ItemDaListaEntity itemLista1 = new ItemDaListaEntity(null, 1, produto1, lista3);
		ItemDaListaEntity itemLista2 = new ItemDaListaEntity(null, 3, produto2, lista3);
		ItemDaListaEntity itemLista3 = new ItemDaListaEntity(null, 4, produto3, lista1);
		ItemDaListaEntity itemLista4 = new ItemDaListaEntity(null, 2, produto4, lista2);
		
		itemDaListaRepository.saveAll(Arrays.asList(itemLista1,itemLista2,itemLista3,itemLista4));
	
		
		
	}

	
	
}
