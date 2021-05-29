package ex14;

public class CaixaEletronico {

	public enum Operacoes {
		SAQUE, TRANSFERENCIA
	}

	public static boolean isCedulasSuficientes = true;
	
	synchronized void sacar(int valor) throws InterruptedException {

		System.out.println("Operação de saque de: " + valor);

		while (!isCedulasSuficientes) {
			notifyAll();
			System.out.println("Precisa de abastecimento");
			wait();
		}

		isCedulasSuficientes = false;
	}

	synchronized void abastecer() throws InterruptedException {

		while (isCedulasSuficientes) {
			notifyAll();

			System.out.println("Não precisa de abastecimento por enquanto");
			wait();
		}

		System.out.println("Abastecendo");

		isCedulasSuficientes = true;

		notifyAll();
	}

	void transferir(double valor) {
		System.out.println("Iniciando transferência de: " + valor);
	}
}
