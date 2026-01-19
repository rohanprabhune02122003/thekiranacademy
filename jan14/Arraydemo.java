package com.tka.jan14;

public class Arraydemo {
	
	public static void main(String[] args){
		
		int size = 5;
		int[] marks = new int[size];
		
		marks[0] = 78;
		marks[1] = 67;
		marks[2] = 90;
		marks[3] = 93;
		marks[4] = 96;
		
		System.out.println(marks);	// memory address
//		System.out.println(marks[0]);
		
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] > 90) {
				System.out.println(i+"-------->"+marks[i]);
			}
		}
		
		for (int m :marks) {
			if(m>90) {
				System.out.println(m);
			}
		}
	}
}
