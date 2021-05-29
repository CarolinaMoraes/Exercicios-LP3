package ex12;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor para X: ");

		int x = scan.nextInt();

		int z;

		do {
			System.out.println("Digite um valor para Z (deve ser maior do que X): ");
			z = scan.nextInt();
		} while (z < x);

		new Thread(new ThreadSomaMinima(x, z)).start();
		
		scan.close();
	}

}
