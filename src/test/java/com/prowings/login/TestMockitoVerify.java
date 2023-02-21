package com.prowings.login;

import static org.mockito.Mockito.times;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestMockitoVerify {

	@Mock
	I obj;
	

	@Test
	public void testMethodOccurance()
	{
		MyImpl impl = new MyImpl(obj);
		
		impl.perform();
		
		Mockito.verify(obj, times(2)).callback();

		System.out.println("test passed");
	}

}

