package ex2;

public class Inicio {

	public static void main(String[] args) {

		InterfaceFuncional func = (msg) -> {
			System.out.println(msg);
		};

		func.show("Life is not worth a damn till you can say: I am what I am");
	}

}
