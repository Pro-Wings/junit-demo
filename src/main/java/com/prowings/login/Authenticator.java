package com.prowings.login;

public class Authenticator {
	
	public Boolean login(String username, String password)
	{
		
		System.out.println("call started");
		
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
//dev d1 changed the commit msg
}
