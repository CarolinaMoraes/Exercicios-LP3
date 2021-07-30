package ex;

public class Produto {

	private String nome;

	private Double preco;

	private String marca;

	public Produto() {};
	
	public Produto(String nome, Double preco, String marca) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", marca=" + marca + "]";
	}

	
}
