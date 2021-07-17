package ex3.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import ex3.models.Produto;

public class ProdutoRepository {

	public static HashMap<UUID, Integer> estoque;

	public static List<Produto> produtosDisponiveis;

	public static final void criarProdutos() {

		estoque = new HashMap<UUID, Integer>();
		produtosDisponiveis = new ArrayList<Produto>();

		Produto produto1 = new Produto("Arroz", 20.0);
		Produto produto2 = new Produto("Feij�o", 16.0);
		Produto produto3 = new Produto("�leo", 15.0);

		produtosDisponiveis.add(produto1);
		produtosDisponiveis.add(produto2);
		produtosDisponiveis.add(produto3);

		estoque.put(produto1.getId(), 3);
		estoque.put(produto2.getId(), 3);
		estoque.put(produto3.getId(), 3);
	}

	public static final void darBaixaEmProduto(UUID codigoProduto) {
		Integer qtdAtual = estoque.get(codigoProduto);
		estoque.put(codigoProduto, qtdAtual - 1);
	}
}
