package ex3;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro");
		Integer valor = scan.nextInt();

		System.out.println("Fatorial: "
				+ Stream.iterate(valor, n -> n >= 2, n -> n - 1).reduce((acc, numAtual) -> acc * numAtual).get());

		scan.close();
	}

}
