package com.tka.dec18;

public class TestFizzbuzz {

	public static void main(String[] args) {
		
		Fizzbuzz fb = new Fizzbuzz();
		
		fb.fizzBuzz(6); // for Fizz (divisible by 3)
		fb.fizzBuzz(25); // for Buzz (divisible by 5)
		fb.fizzBuzz(15); // for Fizzbuzz (divisible by 3 and 5)
		
	}
}