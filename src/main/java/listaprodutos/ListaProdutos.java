package listaprodutos;

import java.util.ArrayList;
import java.util.List;

import itemdalista.ItemDaLista;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import user.User;

@Entity
@Table(name = "tb_lista")
public class ListaProdutos {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany
	private List<ItemDaLista> itemDaLista = new ArrayList<>();
	
	
	public ListaProdutos() {
	
	}


	public ListaProdutos(Long id, String name, User user) {
		
		this.id = id;
		this.name = name;
		this.user = user;
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
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public User getUserEntity() {
		return user;
	}


	public void setUserEntity(User user) {
		this.user = user;
	}


	public List<ItemDaLista> getItemDaLista() {
		return itemDaLista;
	}
	
	
	
	
	

}
