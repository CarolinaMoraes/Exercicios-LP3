package ex1;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.println("Digite um número");
			Integer primeiroNumero = scan.nextInt();

			System.out.println("Digite outro número");
			Integer segundoNumero = scan.nextInt();

			if (primeiroNumero < 0 || segundoNumero < 0) {
				throw new IllegalArgumentException("Erro: Argumento negativo");
			}

			if (primeiroNumero > 1000 || segundoNumero > 1000) {
				throw new IllegalArgumentException("Erro: digite um valor menor que 1000");
			}

			float resultado = primeiroNumero / segundoNumero;
			System.out.println("Resultado: " + resultado);
		}

		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Não é possível dividir por 0");
		} catch (Exception e) {
			System.out.println("Um erro ocorreu: ");
			e.printStackTrace();
		} finally {
			System.out.println("Finalizada a execução");
		}
		scan.close();
	}

}
