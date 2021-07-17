package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ex3.exceptions.SemEstoqueException;
import ex3.models.Cliente;
import ex3.models.Pedido;
import ex3.repositories.PedidoRepository;
import ex3.repositories.ProdutoRepository;

public class Main {

	public static void main(String[] args) {

		ProdutoRepository.criarProdutos();

		List<Cliente> clientes = new ArrayList<Cliente>();

		// Cadastrando um cliente com CPF errado
		Optional<Cliente> cliente1 = Optional.ofNullable(cadastrarCliente("Ana", "123456"));
		cliente1.ifPresent(c -> clientes.add(c));

		// Cadastrando um cliente correto
		Optional<Cliente> cliente2 = Optional.ofNullable(cadastrarCliente("Julia", "12345678901"));
		cliente1.ifPresent(c -> clientes.add(c));

		fazerPedido(cliente2.get());
		fazerPedido(cliente2.get());
		fazerPedido(cliente2.get());
			
		// Há somente 3 unidades de cada produto disponível no estoque, neste ele irá dar erro
		fazerPedido(cliente2.get());
	
		// Vendo todas as compras que foram feitas
		PedidoRepository.getCompras();
	}

	public static void fazerPedido(Cliente cliente) {
		System.out.println("\n" + cliente.getNome() + " fazendo pedido");

		// Simulando compra com todos os produtos que estão disponíveis no mercado
		Pedido pedido = new Pedido(ProdutoRepository.produtosDisponiveis, cliente);

		try {
			PedidoRepository.savePedido(pedido);
		} catch (SemEstoqueException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Um erro inesperado ocorreu");
			e.printStackTrace();
		}

	}

	public static Cliente cadastrarCliente(String nome, String cpf) {
		System.out.println("\nCadastrando cliente: " + nome);

		try {
			Cliente clienteComCpfErrado = new Cliente(nome, cpf);
			System.out.println("Criado com sucesso");
			return clienteComCpfErrado;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
