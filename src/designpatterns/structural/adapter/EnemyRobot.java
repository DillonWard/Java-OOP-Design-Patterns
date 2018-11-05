package designpatterns.structural.adapter;

import java.util.Random;

public class EnemyRobot {

	Random rand = new Random();
	
	public void smashWithHands(){
		int attackDamage = rand.nextInt(5) + 1;
		System.out.println("Enemy robot causes " + attackDamage + " damage");
	}
	
	public void walkForward(){
		
		int movement = rand.nextInt(5) + 1;
		System.out.println("Enemy Robot walks " + movement + " spaces forward");
	}
	
	public void reactToHuman(String driver){
		System.out.println("Enemy robot punches " + driver);
	}
}
