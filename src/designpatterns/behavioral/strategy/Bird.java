package designpatterns.behavioral.strategy;

public class Bird extends Animal{

	public Bird() {
		super();
		
		setSound("Chirp");
		
		flyingType = new CanFly();
	}

}
