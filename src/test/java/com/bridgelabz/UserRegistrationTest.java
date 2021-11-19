package com.bridgelabz;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();
	@Test
	public void givenName_WhenProper_ShouldReturnTrue(){
		boolean result = userRegistration.firstName("Abcd");
		Assert.assertTrue(result);
	}
}
