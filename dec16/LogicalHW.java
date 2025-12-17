package com.tka.dec16;

public class LogicalHW {
	
	boolean a;
	boolean b;
	
	
	void And(boolean a, boolean b) {
	
		System.out.println("And operator output for "+a+" and "+b+" is : "+(a && b));
	}
	
	void Or(boolean a, boolean b) {
		
		System.out.println("OR operator output for "+a+" and "+b+" is : "+(a || b));
	}
	
	void Not(boolean a, boolean b) {
		
		System.out.println("Not / inverse operator output for "+a+" is : "+ !a);
		System.out.println("Not / inverse operator output for "+b+" is : "+ !b);
		
	}
	
	void NotAnd(boolean a, boolean b) {
		
		System.out.println("And operator inverse output for "+a+" and "+b+" is : "+!(a && b));
	}
	
	void NotOr(boolean a, boolean b) {
		
		System.out.println("Or operator inverse output for "+a+" and "+b+" is : "+!(a || b));
	}
}
