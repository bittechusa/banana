package Modifire;

import Modifire1.c;

public class B{
	public static void main(String[] args) {
		A x = new A();
		
		//x.m4(); private is not accessible in same package 
		//using object creation
		c y = new c ();
		//y.m2(); we can see only public from different 
		//package using object creation
	}


}
