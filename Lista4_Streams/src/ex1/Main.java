package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		System.out.println("Insira um número limite: ");
		Scanner scan = new Scanner(System.in);

		Integer numeroLimite = scan.nextInt();
		scan.close();

		System.out.println("Gerando lista de números duplicados...");

		List<Integer> numerosDuplicados = new ArrayList<Integer>();

		Stream.iterate(1, n -> n <= numeroLimite, n -> n + 1)
				.forEach(x -> numerosDuplicados.addAll(Arrays.asList(x, x)));

		System.out.println("Imprimindo lista....");
		numerosDuplicados.stream().forEach(n -> System.out.println(n));

		System.out.println("Imprimindo lista sem repetição....");
		numerosDuplicados.stream().distinct().forEach(n -> System.out.println(n));

		System.out.println("Imprimindo ímpares sem repetição....");
		numerosDuplicados.stream().distinct().filter(n -> n % 2 != 0).forEach(n -> System.out.println(n));

		System.out.println("Imprimindo pares sem repetição....");
		numerosDuplicados.stream().distinct().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		if (numerosDuplicados.stream().distinct().count() > 5) {
			System.out.println("Imprimindo a partir do 5º elemento sem repetição....");
			numerosDuplicados.stream().distinct().skip(5).forEach(n -> System.out.println(n));
		}

		System.out.println("Imprimindo todos multiplicados por 4....");
		numerosDuplicados.stream().map(n -> n * 4).forEach(n -> System.out.println(n));
	}

}
