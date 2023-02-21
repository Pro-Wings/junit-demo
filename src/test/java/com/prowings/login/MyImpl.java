package com.prowings.login;

public class MyImpl {

	private I obj;

	public MyImpl(I obj) {
		this.obj = obj;
	}
	
	public void perform(){
		obj.callback();
		obj.callback();
		obj.callback();
	  }
	
}
