package entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_lista")
public class ListaProdutos {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User userEntity;
	
	@OneToMany(mappedBy = "listaProdutosEntity")
	private List<ItemDaLista> itemDaListaEntity = new ArrayList<>();
	
	
	public ListaProdutos() {
	
	}


	public ListaProdutos(Long id, String name, User user) {
		
		this.id = id;
		this.name = name;
		this.userEntity = user;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public User getUser() {
		return userEntity;
	}


	public void setUser(User user) {
		this.userEntity = user;
	}


	public User getUserEntity() {
		return userEntity;
	}


	public void setUserEntity(User userEntity) {
		this.userEntity = userEntity;
	}


	public List<ItemDaLista> getItemDaListaEntity() {
		return itemDaListaEntity;
	}
	
	
	
	
	

}
