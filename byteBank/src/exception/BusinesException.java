package exception;

public class BusinesException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public BusinesException(String msg) {
		super("Operação não autorizada" + msg);
	}
	
	

}
