package PasswordCheck;

public class TooLongException extends RuntimeException {
	public TooLongException (String pwd) {
		super(pwd);
	}
}
