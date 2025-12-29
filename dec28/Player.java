package com.tka.dec28;

public class Player {
	
	int jersey_no;
	String p_name;
	int runs;
	int wickets;
	String team_name;
	
	Player(int j, String p, int r, int w, String t){
		
		jersey_no = j;
		p_name = p;
		runs = r;
		wickets = w;
		team_name = t;
		
	}
	
	void display() {
		
		System.out.println("Jersey no : " + jersey_no);
		System.out.println("Player name : " + p_name);
		System.out.println("Runs : " + runs);
		System.out.println("Wickets : " + wickets);
		System.out.println("Team name : " + team_name);
		System.out.println();
	}
}
