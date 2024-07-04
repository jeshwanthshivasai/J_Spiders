package PasswordCheck;

public class Password {
	public String pwd;
	public void setpwd(String pwd) {
		if (pwd.length() < 8) {
			throw new TooShortException("Too short bro!");
		} else if (pwd.length() > 8) {
			throw new TooLongException("Too long bro!");
		} else {
			System.out.println(pwd);
		}
	}
}