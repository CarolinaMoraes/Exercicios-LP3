package ex13;

public class Inicio {

	public static void main(String[] args) {
		Thread cliente1 = new Thread(new ThreadCliente(CaixaEletronico.Operacoes.SAQUE), "Cliente-1");
		Thread cliente2 = new Thread(new ThreadCliente(CaixaEletronico.Operacoes.TRANSFERENCIA), "Cliente-2");
		Thread cliente3 = new Thread(new ThreadCliente(CaixaEletronico.Operacoes.SAQUE), "Cliente-3");

		cliente1.start();
		cliente2.start();
		cliente3.start();

		try {
			cliente1.join();
			cliente2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
