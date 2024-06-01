package com.smartmarketlist.SmartMarketListApi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.ItemDaLista;
import entities.ListaProdutos;
import entities.Produto;
import entities.User;
import enums.TypeUser;
import repositories.ItemDaListaRepository;
import repositories.ListaProdutosRepository;
import repositories.ProdutoRepository;
import repositories.UserRepository;

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
		
		User usuario1 = new User(null, "João Lacerda", "9985221147", "joaolacerda@gmail.com",TypeUser.FREE_USER);
		User usuario2 = new User(null, "Elvis Presley", "9985229999", "qqcoisa@gmail.com",TypeUser.FREE_USER);
		User usuario3 = new User(null, "Batman da Silva", "999999999", "batman@gmail.com",TypeUser.PREMIUM_USER);
		
		userRepository.saveAll(Arrays.asList(usuario1,usuario2,usuario3));
		
		
		Produto produto1 = new Produto(null, "Açucar");
		Produto produto2 = new Produto(null, "Massa");
		Produto produto3 = new Produto(null, "Desinfetante");
		Produto produto4 = new Produto(null, "Detergente");
	
		produtoRepository.saveAll(Arrays.asList(produto1,produto2,produto3,produto4));
		
		ListaProdutos lista1 = new ListaProdutos(null, "Produtos de Higiene", usuario1);
		ListaProdutos lista2 = new ListaProdutos(null, "Produtos de Cozinha", usuario1);
		ListaProdutos lista3 = new ListaProdutos(null, "cesta básica", usuario2);
		
		listaProdutosRepository.saveAll(Arrays.asList(lista1,lista2,lista3));
		
		ItemDaLista itemLista1 = new ItemDaLista(null, 1, produto1, lista3);
		ItemDaLista itemLista2 = new ItemDaLista(null, 3, produto2, lista3);
		ItemDaLista itemLista3 = new ItemDaLista(null, 4, produto3, lista1);
		ItemDaLista itemLista4 = new ItemDaLista(null, 2, produto4, lista2);
		
		itemDaListaRepository.saveAll(Arrays.asList(itemLista1,itemLista2,itemLista3,itemLista4));
	
		
		
	}

	
	
}
