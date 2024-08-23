package kr.co.liberation;

public class PasswordStrenthMeter {

	public PasswordStrength meter(String password) {
		if(password.length() < 8) return PasswordStrength.NORMAL;
		return PasswordStrength.STRONG;
	}

}
