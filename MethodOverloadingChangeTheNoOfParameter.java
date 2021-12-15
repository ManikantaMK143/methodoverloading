package com.technoelevate.methodloading;

public class MethodOverloadingChangeTheNoOfParameter {
	public static  void add(int x , int y) {
		System.out.println(x+y);
	}
	public void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	

	public static void main(String[] args) {
		MethodOverloadingChangeTheNoOfParameter obj = new  MethodOverloadingChangeTheNoOfParameter();
		//static method can be accesed within the class by the name itself
		add(2,3);
		obj.add(2,3,5);
	

	}

}
