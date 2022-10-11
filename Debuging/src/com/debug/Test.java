package com.debug;

public class Test {
	
	public static void main(String[] args) {
			
		int a=10;
		
		show();
		System.out.println("start");
		a=a++ + ++a - ++a + a++;	
		
		if(a>55) {
			
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
		
		
		
		
	}
	public static void show() {
		
		System.out.println("show method");
			int k=10;
			
			k=k++ + ++k - k++;
			
			System.out.println("show "+k);
			System.out.println("about exist");
		}

}
