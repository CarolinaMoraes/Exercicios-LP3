package ex1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Inicio {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(2, 3, 4, 5, 6);

		operarNumeros(numeros, (n) -> true);
	}

	public static void operarNumeros(List<Integer> numeros, Predicate<Integer> predicate) {
		numeros.forEach(n -> {
			System.out.println("N�mero: "+ n);
			System.out.println("N�mero ao quadrado: "+ n*n);
			System.out.println("Dobro do n�mero: "+ n*2);
			System.out.println("N�mero + 3: "+ (n+3));
		});
	}
}
