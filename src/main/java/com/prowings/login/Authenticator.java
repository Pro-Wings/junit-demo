package com.prowings.login;

public class Authenticator {
	
	public boolean login(String username, String password)
	{
		
		if(username.equalsIgnoreCase("abc1234") && password.equalsIgnoreCase("P@ssword"))
		{
			return true;
		}
		else
			return false;
	}

	public void timeout() throws InterruptedException
	{
		Thread.sleep(900);
	}
//dev d2 change	
}
