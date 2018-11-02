package designpatterns.creational.prototype;

public class Sheep implements Animal{

	public Sheep() {
		System.out.println("Sheep is made");
	}

	// clone the supertype of Animal and cast it to whatever we want it to be
	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is being made");
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep)super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sheepObject;
	}
	
	public String toString(){
		return "Dolly has been cloned";
	}

}
