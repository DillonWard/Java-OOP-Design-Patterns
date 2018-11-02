package designpatterns.creational.strategy;

public class Dog extends Animal {
	
	// only dogs can dig a hole so this is defined here rather than in Animal
	public void digHole(){
		System.out.println("Dug a hole");
	}
	
	public Dog(){
		super();
		
		setSound("Bark");
		
		// sets the fly interface polymorphically - refer to flys interface and change without changing behavior
		flyingType = new CantFly();
	}
	
}
