package ex1;

import java.util.Optional;

public class ExercicioB {

	public static void main(String[] args) {
		// Teste: se o optional vazio obter a string usando orElse & Mostrar o resultado
		Optional<String> retornoVazio = Optional.empty();
		Optional<String> retornoComValor = Optional.of("Aqui tem valor, parceiro");
		

		System.out.println(retornoVazio.orElse("Esse optional não tinha valor"));
		System.out.println(retornoComValor.orElse("Isso não será printado"));
		

		// Teste: se o optional vazio obter a string usando orElseGet & Mostrar o resultado
		System.out.println(retornoVazio.orElseGet(() -> "Esse optional não tinha valor"));
		System.out.println(retornoComValor.orElseGet(() -> "Isso não será printado"));
	}

}
