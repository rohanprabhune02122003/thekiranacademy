package com.tka.dec18;

public class Fizzbuzz {
	
	int num;
	
	void fizzBuzz(int num) {
		
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println(num +" : FizzBuzz");
		}
		else if(num % 3 == 0) {
			System.out.println(num +" : Fizz");
		}
		else if(num % 5 == 0) {
			System.out.println(num +" : Buzz");
		}
		else {
			System.out.println("Number is different");
		}
	}
}
