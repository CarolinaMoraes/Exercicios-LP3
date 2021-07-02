package ex2;

import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		
		Optional<String> optionalVazio = Optional.empty();
		Optional<String> optionalComValor = Optional.of("Tem valor!");
		
		
		System.out.println(optionalComValor.orElseThrow(()-> new NullPointerException("Pois é developer, tá vazio")));
		optionalVazio.orElseThrow(()-> new NullPointerException("Pois é developer, tá vazio"));

	}
}
