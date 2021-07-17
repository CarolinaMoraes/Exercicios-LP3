package ex3.exceptions;

public class SemEstoqueException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public SemEstoqueException(String message) {
		super(message);
	}

}
