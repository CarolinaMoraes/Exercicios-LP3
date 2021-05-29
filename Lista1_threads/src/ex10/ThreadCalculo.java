package ex10;

public class ThreadCalculo implements Runnable {

	private String operacao;

	private int valor1;

	private int valor2;

	public ThreadCalculo(String operacao, int valor1, int valor2) {

		this.operacao = operacao;
		this.valor1 = valor1;
		this.valor2 = valor2;

	}

	@Override
	public void run() {
		switch (this.operacao) {
		case "+":
			System.out.println("Resultado: " + (valor1 + valor2));
			break;

		case "-":
			System.out.println("Resultado: " + (valor1 - valor2));
			break;

		case "*":
			System.out.println("Resultado: " + (valor1 * valor2));
			break;

		case "/":
			System.out.println("Resultado: " + (valor1 / valor2));
			break;

		default:
			System.out.println("Operação inválida");
			break;
		}
	}

}
