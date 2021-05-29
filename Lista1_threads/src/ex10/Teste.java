package ex10;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Insira n�meros inteiros, faz favor");

		System.out.println("Digite o primeiro n�mero: ");
		int numero1 = scan.nextInt();

		System.out.println("Digite o segundo n�mero: ");
		int numero2 = scan.nextInt();

		System.out.println("Escolha uma opera��o matem�tica (+, -, /, *)");
		String operacao = scan.next();
		
		Thread threadCalculo = new Thread(new ThreadCalculo(operacao, numero1, numero2));
		threadCalculo.start();
		
		scan.close();
	}

}
