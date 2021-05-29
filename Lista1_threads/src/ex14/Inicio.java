package ex14;

public class Inicio {

	public static void main(String[] args) {

		CaixaEletronico caixa = new CaixaEletronico();

		Thread cliente1 = new Thread(new ThreadCliente(CaixaEletronico.Operacoes.SAQUE, caixa), "Cliente-1");
		Thread cliente2 = new Thread(new ThreadCliente(CaixaEletronico.Operacoes.SAQUE, caixa), "Cliente-2");
		Thread reabastecimento = new Thread(new ThreadReabastecerCedulas(caixa));

		cliente1.start();

		try {
			cliente1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		cliente2.start();
		reabastecimento.start();
	}
}
