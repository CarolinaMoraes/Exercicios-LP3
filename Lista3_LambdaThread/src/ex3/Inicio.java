package ex3;

import java.util.function.Function;

public class Inicio {

	static class Fatorial {
		Function<Integer, Integer> func;
	}

	public static void main(String[] args) {

		Fatorial fat = new Fatorial();
		
		fat.func = (n) -> {

			if (n == 0) {
				return 1;
			}

			else {
				return n * fat.func.apply(n - 1);
			}
		};
		
		System.out.println(fat.func.apply(5));
	}

}
