package br.com.primeiroProjeto.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
@SequenceGenerator(name = "produto", allocationSize = 1, sequenceName = "sq_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "produto")
	@Column(name = "cd_produto")
	private Integer id;
	
	@Column(name = "nm_nome")
	private String nome;
	
	@Column(name = "qtd_quantidade")
	private Integer quantidade;

	public Produto() {
	}

	public Produto(String nome, int quantidade) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
