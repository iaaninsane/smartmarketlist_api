package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.ItemDaLista;

public interface ItemDaListaRepository extends JpaRepository<ItemDaLista,Long> {
	
	
}
