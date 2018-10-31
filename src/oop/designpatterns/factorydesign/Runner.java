package oop.designpatterns.factorydesign;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		EnemyShip theEnemy = null;
		EnemyShipFactory factory = new EnemyShipFactory();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What type of ship? U/R/B");
		
		if(scanner.hasNextLine()){
			String typeOfShip = scanner.nextLine();
			theEnemy = factory.makeEnemyShip(typeOfShip);
		}
		
		if(theEnemy != null)
		enemyDoStuff(theEnemy);
	}
	
	public static void enemyDoStuff(EnemyShip enemy){
		enemy.displayEnemyShip();
		enemy.followHeroShip();
		enemy.enemyShipShoots();
	}
}
