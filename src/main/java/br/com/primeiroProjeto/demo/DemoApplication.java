package br.com.primeiroProjeto.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.primeiroProjeto.demo.model.Produto;
import br.com.primeiroProjeto.demo.service.ProdutoService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private ProdutoService produtoService;
		
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Produto produto = new Produto("Maça", 400);
		
		// Cadastrando produto
		produtoService.create(produto);
	}

}
