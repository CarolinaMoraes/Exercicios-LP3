package ex3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Gerando 100 n�meros aleat�rios");
		Stream<Integer> numerosAleatorios = Stream.generate(() -> new Random().nextInt(100)).limit(100);
		numerosAleatorios.forEach(System.out::println);

		
		
		System.out.println("Gerando lista com 10 n�meros");
		List<Integer> dezNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Integer menorNumero = dezNumeros.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Menor n�mero da lista: "+ menorNumero);
		
		Integer maiorNumero = dezNumeros.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maior n�mero da lista: "+ maiorNumero);
		
		Long qtdNumeros =  dezNumeros.stream().count();
		System.out.println("Quantidade de n�meros: "+ qtdNumeros);
		
	}
}
