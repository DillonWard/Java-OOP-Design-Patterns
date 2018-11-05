package designpatterns.structural.decorator;

public class Mozarella extends ToppingsDecorator {

	public Mozarella(Pizza pizza) {
		super(pizza); // super is a reference to ToppingsDecorator
		
		System.out.println("Adding dough");
		System.out.println("Adding Mozarella");
	}
	
	public String getDescription(){
		return pizza.getDescription() + ", Mozarella"; // appending to description
	}
	
	public double getCost(){
		return pizza.getCost() + .50;
	}

}
