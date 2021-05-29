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
		System.out.println("Iniciando somatória");
		facaSomatoriaEntre();
	}

	private void facaSomatoriaEntre() {

		int somaAtual = x;

		// Array para printar na tela
		ArrayList<Integer> numerosUtilizados = new ArrayList<Integer>();
		numerosUtilizados.add(x); // O primeiro número utilizado é o próprio x

		for (int i = 1; somaAtual <= z; i++) {

			// Soma o x com o i para obter o número inteiro atual,
			// então se x = 2, e i = 1 quer dizer que o número inteiro atual é 3
			// na próxima iteração será (x = 2) + (i = 2) que resultará 
			// no número inteiro 4 e assim por diante

			numerosUtilizados.add((x + i));

			// Soma o valor da soma atual mais o número inteiro atual
			somaAtual += x + i;
		}

		for (int i = 0; i < numerosUtilizados.size(); i++) {
			int numeroAtual = numerosUtilizados.get(i);

			// Printe cada número utilizado para atingir a soma
			System.out.print(numeroAtual);

			// Se for o último número não imprima o sinal de adição
			if (i != numerosUtilizados.size() - 1) {
				System.out.print(" + ");
			}
		}

		System.out.print(" = " + somaAtual);
	}

}
