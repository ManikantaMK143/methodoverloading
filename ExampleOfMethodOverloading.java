package com.technoelevate.methodloading;

public class ExampleOfMethodOverloading {
	public static int add(int...x) {
		int result=0;
		for(int i=0;i<x.length;i++) {
			result+=x[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int sum=add(1,2,3);
		System.out.println(sum);
		

	}

}
