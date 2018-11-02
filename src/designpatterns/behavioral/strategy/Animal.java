package designpatterns.behavioral.strategy;

// create a super class for each object since each object can be abstracted into an animal
// e.g. a Dog IS A Animal, a Dog HAS A name/height etc.
public class Animal {

	
	private String name;
	private double height;
	private double weight;
	private String sound;
	private String favFood;
	private double speed;
	
	// Composition - create an instance variable that is a subclass of the fly's interface
	// instead of inheriting an ability a class is composed of objects with abilities built into it
	// this allows for the changing of behavior without side effects
	// starts off non-flying - can be changed into a flying object dynamically
	public Flys flyingType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		
		if(weight >= 0){
			this.weight = weight;
		}else{
			System.out.println("Weight must be greater than 0");
		}
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getFavFood() {
		return favFood;
	}
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	
	public String tryToFly(){
		return flyingType.fly();			
	}
	
	public void setFlyingAbility(Flys newFlyType){
		flyingType = newFlyType;
	}
	
	
}
