package ex10;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira números inteiros, faz favor");

		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();

		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();

		System.out.println("Escolha uma operação matemática (+, -, /, *)");
		String operacao = scan.next();
		
		Thread threadCalculo = new Thread(new ThreadCalculo(operacao, numero1, numero2));
		threadCalculo.start();
		
		scan.close();
	}

}
