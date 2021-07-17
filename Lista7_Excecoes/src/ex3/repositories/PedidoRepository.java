package ex3.repositories;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import ex3.exceptions.SemEstoqueException;
import ex3.models.Pedido;
import ex3.models.Produto;

public class PedidoRepository {

	private static List<Pedido> compras = new ArrayList<Pedido>();

	public static void savePedido(Pedido pedido) {

		System.out.println("Computando pedido");

		List<Produto> produtos = pedido.getProdutosDaCompra();

		produtos.forEach(prod -> {

			// Validando a compra
			if (ProdutoRepository.estoque.containsKey(prod.getId())) {

				Integer quantidadeDisponivel = ProdutoRepository.estoque.get(prod.getId());

				if (quantidadeDisponivel == 0) {
					throw new SemEstoqueException("O produto: " + prod.getNome() + " não possui estoque disponível");
				} else {
					ProdutoRepository.darBaixaEmProduto(prod.getId());
				}

			} else {
				throw new IllegalArgumentException("O produto solicitado não existe");
			}
		});

		compras.add(pedido);
		System.out.println("Pedido finalizado com sucesso");
	}

	public static void getCompras() {
		compras.forEach(c -> {
			System.out.println("\nCompra: " + c.getId());

			System.out.println("Cliente: " + c.getComprador().getNome() + " - " + c.getComprador().getCpf());

			SimpleDateFormat spdf = new SimpleDateFormat("dd-MM-YYYY");

			System.out.println("Comprado em: " + spdf.format(c.getDataPedido()));
			c.getProdutosDaCompra().forEach(pc -> {
				System.out.println("Produto: " + pc.getNome() + " - R$:" + pc.getPreco());
			});
		});
	}

}
