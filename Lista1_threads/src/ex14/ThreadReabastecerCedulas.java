package ex14;

public class ThreadReabastecerCedulas implements Runnable {

	private CaixaEletronico caixa;

	public ThreadReabastecerCedulas(CaixaEletronico caixa) {

		this.caixa = caixa;
	}

	@Override
	public void run() {
		try {

			if (!CaixaEletronico.isCedulasSuficientes) {
				caixa.abastecer();
			}

		} catch (InterruptedException e) {
		}
	}
}
