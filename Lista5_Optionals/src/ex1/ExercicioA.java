package ex1;

import java.util.Optional;

public class ExercicioA {

	public static void main(String[] args) {

		// Teste: se o optional vazio obter a string usando orElse & Mostrar o resultado

		Optional<String> retorno = Optional.empty();

		System.out.println(retorno.orElse("Valor diferente"));

		// Teste: se o optional vazio obter a string usando orElseGet & Mostrar o resultado
		System.out.println(retorno.orElseGet(() -> "Valor novo"));

	}

}
