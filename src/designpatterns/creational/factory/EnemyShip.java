package designpatterns.creational.factory;

public abstract class EnemyShip {

	private String name;
	private double damage;
	
	public EnemyShip() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	public void followHeroShip(){
		System.out.println(getName() + " is following you!");
	}
	
	public void displayEnemyShip(){
		System.out.println(getName() + " is on the radar!");
	}
	
	public void enemyShipShoots(){
		System.out.println(getName() + " attacks and did " + getDamage());
	}

}
