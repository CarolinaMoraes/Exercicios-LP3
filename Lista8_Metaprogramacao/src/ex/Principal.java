package ex;

public class Principal {

	public static void main(String[] args) {

		Produto produto = new Produto("Arroz", 15.0, "Camil");
		Reflection reflection = new Reflection(produto);
		
		reflection.doAnalise();
		
		reflection.createNewObject("ex.Produto");
	}

}
