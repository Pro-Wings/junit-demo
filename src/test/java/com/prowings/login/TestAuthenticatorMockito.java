package com.prowings.login;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestAuthenticatorMockito {
	
//	@Spy
	@Mock
	Authenticator auth;
	
	@Test
	public void mockitoDemo1()
	{
		Boolean res = true;
		
		when(auth.login(anyString(), anyString())).thenReturn(res);				
		assertTrue(auth.login("ASASD", "KJHKH"));
	}
	
}
