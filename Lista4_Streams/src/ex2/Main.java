package ex2;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream.iterate(0, n -> n <= 9, n -> n + 1) // 0,1,2,3,4,5,6,7,8,9 - 0 a 9
				.filter(n -> n % 2 == 0) // 0,2,4,6,8 - somente pares
				.skip(2) // 4,6,8 - pule 2
				.limit(2) // 4,6 - limite para 2
				.map(x -> x * 2) // 8,12 - multiplique todos por 2
				.forEach(System.out::println);
	}

}
