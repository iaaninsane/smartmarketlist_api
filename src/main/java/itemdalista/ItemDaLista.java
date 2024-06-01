package itemdalista;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import listaprodutos.ListaProdutos;
import produto.Produto;

@Entity
@Table(name = "tb_item_da_lista")
public class ItemDaLista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer qtd; 
	
	@ManyToOne
	@JoinColumn(name="produto_id")
	private Produto produtoEntity;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="lista_id")
	private ListaProdutos listaProdutosEntity;

	
	
	public ItemDaLista() {
		
	}


	public ItemDaLista(Long id, Integer qtd, Produto produtoEntity,
			ListaProdutos listaProdutosEntity) {
		
		this.id = id;
		this.qtd = qtd;
		this.produtoEntity = produtoEntity;
		this.listaProdutosEntity = listaProdutosEntity;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getQtd() {
		return qtd;
	}


	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}


	public Produto getProdutoEntity() {
		return produtoEntity;
	}


	public void setProdutoEntity(Produto produtoEntity) {
		this.produtoEntity = produtoEntity;
	}


	public ListaProdutos getListaProdutosEntity() {
		return listaProdutosEntity;
	}


	public void setListaProdutosEntity(ListaProdutos listaProdutosEntity) {
		this.listaProdutosEntity = listaProdutosEntity;
	}
	
	
	

}
