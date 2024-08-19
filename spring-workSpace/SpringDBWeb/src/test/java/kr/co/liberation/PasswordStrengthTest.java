package kr.co.liberation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PasswordStrengthTest {

	@Test
	public void needsAllCriteria() {
		PasswordStrenthMeter meter = new PasswordStrenthMeter();
		PasswordStrength result = meter.meter("ab12!@ABC");
		assertEquals(PasswordStrength.STRONG, result);
	}
	
	@Test
	public void needsSomeCriteria() {
		PasswordStrenthMeter meter = new PasswordStrenthMeter();
		PasswordStrength result = meter.meter("ab12!AB");
		assertEquals(PasswordStrength.NORMAL, result);
	}	
}
