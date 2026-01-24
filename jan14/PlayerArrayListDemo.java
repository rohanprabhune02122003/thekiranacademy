package com.tka.jan14;

import java.util.ArrayList;

public class PlayerArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Player> rcb = new ArrayList<Player>();
		
		rcb.add(new Player(18, "Virat Kohli", 657, 0, "RCB"));
	    rcb.add(	new Player(97, "Rajat Patidar", 420, 0, "RCB"));
	    rcb.add(	new Player(88, "Phil Salt", 360, 0, "RCB"));
	    rcb.add(	new Player(33, "Liam Livingstone", 280, 6, "RCB"));
	    rcb.add(new Player(31, "Mohammed Siraj", 15, 16, "RCB"));
		
	    System.out.println("------Players-------");
        for (Player p : rcb) {
            System.out.println(p);
        }
        
        int searchJersey = 97;
        System.out.println("\n---- Search Player (Jersey No: " + searchJersey + ") ----");

        for (Player p : rcb) {
            if (p.getJersey_no() == searchJersey) {
                System.out.println(p);
                break;
            }
        }
	}
}
