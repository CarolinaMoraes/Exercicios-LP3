package ex13;

public class CaixaEletronico {

	public enum Operacoes {
		SAQUE, TRANSFERENCIA
	}

	void sacar(int valor) {
		System.out.println("Iniciando saque de: " + valor);
	}

	void transferir(double valor) {
		System.out.println("Iniciando transferência de: " + valor);
	}
}
