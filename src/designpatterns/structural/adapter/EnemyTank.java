package designpatterns.structural.adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{

	Random rand = new Random();
	
	@Override
	public void fireWeapon() {
		int attackDamage = rand.nextInt(10) + 1;
		System.out.println("Enemy Tank does " + attackDamage + " damage");
	}

	@Override
	public void driveForward() {
		int movement = rand.nextInt(5) + 1;
		System.out.println("Enemy Tank moves " + movement + " spaces" );
	}

	@Override
	public void assignDriver(String driver) {
		System.out.println(driver + " is driving the tank");		
	}
}
