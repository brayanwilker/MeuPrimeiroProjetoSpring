package br.com.primeiroProjeto.demo.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_CLIENTE")
@SequenceGenerator(name = "cliente", allocationSize = 1, sequenceName = "sq_cliente")
public class Cliente {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "cliente")
		@Column(name = "cd_id")
		private Long id;
		
		@Column(name = "nm_nome")
		private String nome;
		
		@Column(name = "ds_email")
		private String email;
		
		@Temporal(TemporalType.DATE)
		@Column(name = "dt_nascimento")
		private Calendar dataNascimento;
		
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private List<Produto> produtos = new ArrayList<Produto>();
		
		@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private Endereco endereco;
		

		

		public Cliente(String nome, String email, Calendar dataNascimento, List<Produto> produtos, Endereco endereco) {
			super();
			this.nome = nome;
			this.email = email;
			this.dataNascimento = dataNascimento;
			this.produtos = produtos;
			this.endereco = endereco;
		}

		public Cliente() {
			super();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Calendar getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(Calendar dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public List<Produto> getProdutos() {
			return produtos;
		}

		public void setProdutos(List<Produto> produtos) {
			this.produtos = produtos;
		}
		
		

	

		
		
}
