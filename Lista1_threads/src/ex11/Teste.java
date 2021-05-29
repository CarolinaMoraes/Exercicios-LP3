package ex11;

public class Teste {

	public static void main(String[] args) {
		
		String frase = "O trem de Pirapora";
		
		Thread threadLetras = new Thread(new ThreadConsoantesEVogais(frase));
		threadLetras.start();

	}

}
