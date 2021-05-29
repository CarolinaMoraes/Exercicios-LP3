package ex14;

public class ThreadCliente implements Runnable {

	private CaixaEletronico.Operacoes operacao;
	
	private CaixaEletronico caixa;

	public ThreadCliente(CaixaEletronico.Operacoes operacao, CaixaEletronico caixa) {
		this.operacao = operacao;
		this.caixa = caixa;
	}


	@Override
	public void run() {

		if (operacao == CaixaEletronico.Operacoes.SAQUE) {

			try {
				caixa.sacar(250);
				System.out.println("Aguarde cliente concluir o saque");
				Thread.sleep(4000); // Professor, eu diminuí o tempo de espera para esse exercício
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
