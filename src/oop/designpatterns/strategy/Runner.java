package oop.designpatterns.strategy;

public class Runner {

	public static void main(String[] args) {

		Animal rover = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog " + rover.tryToFly());
		System.out.println("Bird " + tweety.tryToFly());
		
		rover.setFlyingAbility(new CanFly());
		System.out.println("All of a sudden Dog is " + rover.tryToFly());
		
		// Polymorphism being used here - can use the super class of a subclass without changing the superclass
		// Dog can create or add a new method without having to change 'Animal' its superclass
		// Can refer to subclasses by their superclass type which allows for the creation of an array of objects
//		Animal doggy = new Dog();
//		Animal kitty = new Cat();
		
		
		// create an array of animals
//		Animal[] animals = new Animal[4];
		
		// assign the first 2 indexes to the animal object
//		animals[0] = doggy;
//		animals[1] = kitty;
//		
//		System.out.println("Dog says: " + animals[0].getSound());
//		System.out.println("Kitty says: " + animals[1].getSound());
		
		//doggy.digHole(); will not work because it is an Animal, not a dog
//		((Dog)doggy).digHole(); // can cast dog to animal to use the dig method
	}
	
	
}
