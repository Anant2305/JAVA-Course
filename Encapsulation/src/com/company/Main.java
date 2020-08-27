package com.company;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.name = "Anant";
//	    player.health = 20;
//	    player.weapon = "Sword";
//
//	    int damage = 10;
//		player.loseHealth(damage);
//        System.out.println("Remaining Health = " +player.heathRemaining());
//
//		damage = 11;
//		player.health = 200;
//		player.loseHealth(damage);
//		System.out.println("Remaining Health = " +player.heathRemaining());

		EnhancedPlayer player = new EnhancedPlayer("Anant", 50, "Sword");

		System.out.println("Initial Health is " + player.getHealth());

		player.loseHealth(25);
		System.out.println("Remaining health is -" + player.getHealth());
    }

}
