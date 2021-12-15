package com.technoelevate.methodloading;

public class MethodOverloadingWithNumDIff {
	public void login(String username, String password) {
		System.out.println("your username is"+" "+ username);
		System.out.println("your password"+" "+password);
		
	}
	public void login(String password,long phonenumber) {
		System.out.println("your password"+" "+password);
		System.out.println("your phonenumber"+" "+phonenumber);
	}


	public static void main(String[] args) {
		MethodOverloadingWithNumDIff numDIff = new  MethodOverloadingWithNumDIff();
		numDIff.login("M.k","123456789@mk");
		numDIff.login("123456789@mk",8341002799L);
		
	}

}
