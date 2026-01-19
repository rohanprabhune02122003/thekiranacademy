package com.tka.jan14;

public class Player {
	
	private int jersey_no;
	private String player_name;
	private int runs;
	private int wickets;
	private String team_name;
	
	
	public Player(int jersey_no, String player_name, int runs, int wickets, String team_name) {
		
		super();
		this.jersey_no = jersey_no;
		this.player_name = player_name;
		this.runs = runs;
		this.wickets = wickets;
		this.team_name = team_name;
		
	}

	
	public int getJersey_no() {
		return jersey_no;
	}
	
	public void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}
	
	public String getPlayer_name() {
		return player_name;
	}
	
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public int getWickets() {
		return wickets;
	}
	
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public String getTeam_name() {
		return team_name;
	}
	
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	
	
}
