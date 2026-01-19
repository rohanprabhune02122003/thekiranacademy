package com.tka.jan14;

public class TestPlayer {

	public static void main(String[] args){
		
		int size = 11;
		
		Player[] rcb = new Player[size];
		rcb[0] = new Player(18, "Virat Kohli", 657, 0, "RCB");
		rcb[1] = new Player(97, "Rajat Patidar", 420, 0, "RCB");
		rcb[2] = new Player(88, "Phil Salt", 360, 0, "RCB");
		rcb[3] = new Player(33, "Liam Livingstone", 280, 6, "RCB");
		rcb[4] = new Player(23, "Jitesh Sharma", 210, 0, "RCB");
		rcb[5] = new Player(96, "Tim David", 185, 0, "RCB");
		rcb[6] = new Player(5, "Krunal Pandya", 160, 14, "RCB");
		rcb[7] = new Player(8, "Bhuvaneshwar Kumar", 25, 18, "RCB");
		rcb[8] = new Player(38, "Josh Hazlewood", 10, 22, "RCB");
		rcb[9] = new Player(31, "Mohammed Siraj", 15, 16, "RCB");
		rcb[10] = new Player(73, "Romario Shepherd", 120, 10, "RCB");
		
		System.out.println("RCB Batsman");
		for(Player p: rcb) {
			if(p.getRuns() >= 200 && p.getWickets() <= 2) {
				System.out.println(p.getJersey_no()+"----->"+p.getPlayer_name());
			}
		}
		
		System.out.println();
		
		Player[] pbks = new Player[size];
		pbks[0] = new Player(41, "Shreyas Iyer", 585, 0, "Punjab Kings");
		pbks[1] = new Player(17, "Shashank Singh", 410, 0, "Punjab Kings");
		pbks[2] = new Player(25, "Prabhsimran Singh", 395, 0, "Punjab Kings");
		pbks[3] = new Player(23, "Nehal Wadhera", 345, 0, "Punjab Kings");
		pbks[4] = new Player(12, "Liam", 150, 0, "Punjab Kings");
		pbks[5] = new Player(97, "Sam curran", 285, 12, "Punjab Kings");
		pbks[6] = new Player(2, "Harpreet Brar", 110, 11, "Punjab Kings");
		pbks[7] = new Player(11, "Arshdeep Singh", 30, 21, "Punjab Kings");
		pbks[8] = new Player(1, "Yuzvendra Chahal", 15, 19, "Punjab Kings");
		pbks[9] = new Player(99, "Johny Bairstow", 330, 0, "Punjab Kings");
		pbks[10] = new Player(7, "Kagiso Rabada", 18, 17, "Punjab Kings");
		
		System.out.println("Punjab Kings Bowler");
		for(Player p1: pbks) {
			if(p1.getWickets() >= 10 && p1.getRuns() < 150) {
				System.out.println(p1.getJersey_no()+"----->"+p1.getPlayer_name());
			}
		}
		
		System.out.println();
		
		Player[] mi = new Player[size];
		mi[0] = new Player(45, "Rohit Sharma", 430, 0, "Mumbai Indians");
		mi[1] = new Player(63, "Suryakumar Yadav", 717, 0, "Mumbai Indians");
		mi[2] = new Player(9, "Ishan Kishan", 390, 0, "Mumbai Indians");
		mi[3] = new Player(55, "Tilak Varma", 440, 0, "Mumbai Indians");
		mi[4] = new Player(17, "Hardik Pandya", 265, 10, "Mumbai Indians");
		mi[5] = new Player(22, "Tim David", 210, 0, "Mumbai Indians");
		mi[6] = new Player(4, "Kieron Pollard", 120, 0, "Mumbai Indians");
		mi[7] = new Player(93, "Jasprit Bumrah", 10, 20, "Mumbai Indians");
		mi[8] = new Player(12, "Trent Boult", 15, 22, "Mumbai Indians");
		mi[9] = new Player(5, "Piyush Chawla", 35, 14, "Mumbai Indians");
		mi[10] = new Player(99, "Gerald Coetzee", 25, 18, "Mumbai Indians");
		
		System.out.println("Mumbai Indians All Rounder");
		for(Player p2: mi) {
			if(p2.getRuns() >= 150 && p2.getWickets() >= 5) {
				System.out.println(p2.getJersey_no()+"----->"+p2.getPlayer_name());
			}
		}
	}
}
