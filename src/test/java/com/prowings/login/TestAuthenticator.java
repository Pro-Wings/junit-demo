package com.prowings.login;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAuthenticator {

	@BeforeClass
	public static void doSomethingBeforeExecutingAnyTC()
	{
		System.out.println("Before class...");
	}
	@AfterClass
	public static void doSomethingAfterExecutingAnyTC()
	{
		System.out.println("After class...");
	}
	@Before
	public void doSomethingBefore()
	{
		System.out.println("Before...");
	}

	@After
	public void doSomethingAfter()
	{
		System.out.println("After...");
	}
	
	
	@Test
	public void testLogin()
	{
		Authenticator auth = new Authenticator();
		
		String user= "abc1234";
		String pwd = "P@ssword";
		
		boolean res  = auth.login(user, pwd);
		
		assertTrue(res);
		System.out.println("test1 run successfully!!");
	}

	@Test
	public void testLoginWithWrongPwd()
	{
		Authenticator auth = new Authenticator();
		
		String user= "abc1234";
		String pwd = "laskdj";
		
		boolean res  = auth.login(user, pwd);
		
		assertFalse(res);
		System.out.println("test2 run successfully!!");
	}

	@Test
	public void testLoginWithNullPwd()
	{
		Authenticator auth = new Authenticator();
		
		String user= "abc1234";
		String pwd = null;
		
		assertThrows(NullPointerException.class, () -> {
        auth.login(null, pwd);
        
    }); 
		System.out.println("test3 run successfully!!");
	}

	//Useful upto Junit 4
	@Ignore
	@Test(expected = NullPointerException.class)
	public void testLoginWithNullPwd2()
	{
		Authenticator auth = new Authenticator();
		
		String user= "abc1234";
		String pwd = null;
		
		boolean res  = auth.login(user, pwd);

		System.out.println("test4 run successfully!!");
	}

	@Test(timeout = 1000)
	public void testTimeMethod() throws InterruptedException
	{
		Authenticator auth = new Authenticator();
		
		auth.timeout();
	}
}
