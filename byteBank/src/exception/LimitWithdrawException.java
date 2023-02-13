package exception;

public class LimitWithdrawException extends RuntimeException{ 
	
	private static final long serialVersionUID = 1L;

	public LimitWithdrawException(String msg) {
		super(msg);
	}

}
