package ex11;

import java.util.ArrayList;

public class ThreadConsoantesEVogais implements Runnable {

	private String frase;

	private int qtdVogais = 0;
	private int qtdConsoantes;

	public ThreadConsoantesEVogais(String frase) {
		this.frase = frase.toUpperCase().replaceAll(" ", "");
	}

	@Override
	public void run() {

		for (int i = 0; i < this.frase.length(); i++) {
			char ch = this.frase.charAt(i);

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				this.qtdVogais += 1;
			} else {
				this.qtdConsoantes += 1;
			}
		}
		
		System.out.println("Quantidade de vogais: " + this.qtdVogais);
		System.out.println("Quantidade de consoantes: " + this.qtdConsoantes);
	}

}
