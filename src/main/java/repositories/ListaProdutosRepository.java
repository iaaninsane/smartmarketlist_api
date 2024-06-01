package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.ListaProdutos;

public interface ListaProdutosRepository extends JpaRepository<ListaProdutos,Long> {
	
	
}
