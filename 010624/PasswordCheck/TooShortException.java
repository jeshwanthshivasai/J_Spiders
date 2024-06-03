package PasswordCheck;

public class TooShortException extends RuntimeException {
	public TooShortException(String pwd) {
		super(pwd);
	}
}
