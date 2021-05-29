package ex13;

public class ThreadCliente implements Runnable {

	private CaixaEletronico.Operacoes operacao;

	public ThreadCliente(CaixaEletronico.Operacoes operacao) {
		this.operacao = operacao;
	}

	@Override
	public void run() {

		CaixaEletronico caixa = new CaixaEletronico();

		if (operacao == CaixaEletronico.Operacoes.SAQUE) {

			try {
				caixa.sacar(250);
				Thread.sleep(8000);
				System.out.println(Thread.currentThread().getName() + " sacou R$250");
			} catch (InterruptedException e) {
				System.out.println("O saque foi interrompido");
			}
		} else {

			try {
				caixa.transferir(100);
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName() + " transferiu R$100");
			} catch (InterruptedException e) {
				System.out.println("A transferência foi interrompida");
			}
		}

	}

}
