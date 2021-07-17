package ex3.models;

import java.util.UUID;

public class Produto {

	private UUID id;

	private String nome;

	private Double preco;

	public static Integer quantidade;
	
	public Produto(String nome, Double preco) {
		this.id = UUID.randomUUID();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

}
