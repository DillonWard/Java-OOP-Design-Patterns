package oop.designpatterns.prototype;

public class Runner {


	public static void main(String[] args) {
		CloneFactory factory = new CloneFactory();
		Sheep sally = new Sheep();
		Sheep clonedSheep = (Sheep)factory.getClone(sally);
		
		System.out.println(sally);
		System.out.println(clonedSheep);
		// prove that they are different
		System.out.println("Sally Hashcode: " + System.identityHashCode(sally));
		System.out.println("Cloned Hashcode: " + System.identityHashCode(clonedSheep));
	}
}
