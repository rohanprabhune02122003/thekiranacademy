package com.tka.dec16;

public class TestLogicalHW {

	public static void main(String[] args) {
		
		LogicalHW andOp = new LogicalHW();
		
		System.out.println("-------------And truth table----------------");
		andOp.And(false, false);
		andOp.And(false, true);
		andOp.And(true, false);
		andOp.And(true, true);
		System.out.println("--------------------------------------------");
		System.out.println();
		
		LogicalHW orOp = new LogicalHW();
		
		System.out.println("-------------Or truth table----------------");
		orOp.Or(false, false);
		orOp.Or(false, true);
		orOp.Or(true, false);
		orOp.Or(true, true);
		System.out.println("--------------------------------------------");
		System.out.println();
		
		LogicalHW notOp = new LogicalHW();
		
		System.out.println("-------------Not truth table----------------");
		notOp.Not(true, false);
		System.out.println("--------------------------------------------");
		System.out.println();
		
		System.out.println("*****************Inverse AND table************");
		
		LogicalHW notAndOp = new LogicalHW();
		
		notAndOp.NotAnd(false, false);
		notAndOp.NotAnd(false, true);
		notAndOp.NotAnd(true, false);
		notAndOp.NotAnd(true, true);
		System.out.println("************************************************");
		System.out.println();
		
		System.out.println("*****************Inverse OR table************");
		
		LogicalHW notOrOp = new LogicalHW();
		
		notOrOp.NotOr(false, false);
		notOrOp.NotOr(false, true);
		notOrOp.NotOr(true, false);
		notOrOp.NotOr(true, true);
		System.out.println("************************************************");
		System.out.println();
		
	}
}
