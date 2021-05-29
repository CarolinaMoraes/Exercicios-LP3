package ex12;

import java.util.ArrayList;

public class ThreadSomaMinima implements Runnable {

	private int x;
	private int z;

	public ThreadSomaMinima(int x, int z) {
		this.x = x;
		this.z = z;
	}

	@Override
	public void run() {
		System.out.println("Iniciando somat�ria");
		facaSomatoriaEntre();
	}

	private void facaSomatoriaEntre() {

		int somaAtual = x;

		// Array para printar na tela
		ArrayList<Integer> numerosUtilizados = new ArrayList<Integer>();
		numerosUtilizados.add(x); // O primeiro n�mero utilizado � o pr�prio x

		for (int i = 1; somaAtual <= z; i++) {

			// Soma o x com o i para obter o n�mero inteiro atual,
			// ent�o se x = 2, e i = 1 quer dizer que o n�mero inteiro atual � 3
			// na pr�xima itera��o ser� (x = 2) + (i = 2) que resultar� 
			// no n�mero inteiro 4 e assim por diante

			numerosUtilizados.add((x + i));

			// Soma o valor da soma atual mais o n�mero inteiro atual
			somaAtual += x + i;
		}

		for (int i = 0; i < numerosUtilizados.size(); i++) {
			int numeroAtual = numerosUtilizados.get(i);

			// Printe cada n�mero utilizado para atingir a soma
			System.out.print(numeroAtual);

			// Se for o �ltimo n�mero n�o imprima o sinal de adi��o
			if (i != numerosUtilizados.size() - 1) {
				System.out.print(" + ");
			}
		}

		System.out.print(" = " + somaAtual);
	}

}
