package ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Inicio {
	public static void main(String[] args) {

		List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

		new Thread(() -> {
			avaliacoes.add(new Avaliacao("Matemática", "Silvestre está longe", 9.0));
			avaliacoes.add(new Avaliacao("Matemática", "Luiza Afonsa", 7.0));
			avaliacoes.add(new Avaliacao("Matemática", "Relâmpago Marquinhos", 5.0));

			avaliarDesempenho(avaliacoes, (avaliacao) -> avaliacao.getNota() > 6);

		}).start();
	}

	static void avaliarDesempenho(List<Avaliacao> avaliacoes, Predicate<Avaliacao> predicato) {

		Collections.sort(avaliacoes,
				(Avaliacao avaliacao1, Avaliacao avaliacao2) -> avaliacao1.getAluno().compareTo(avaliacao2.getAluno()));

		
		System.out.println("Lista dos aprovados:");
		
		avaliacoes.forEach(av -> {
			if (predicato.test(av)) {
				System.out.println("\n"+av.getAluno());
				System.out.println("Nota: " + av.getNota());
			}
		});
	}
}
