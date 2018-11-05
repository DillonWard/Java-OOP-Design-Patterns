package designpatterns.structural.decorator;

public class TomatoSauce extends ToppingsDecorator {

	public TomatoSauce(Pizza pizza) {
		super(pizza); // super is a reference to ToppingsDecorator
		
		System.out.println("Adding sauce");
	}
	
	public String getDescription(){
		return pizza.getDescription() + ", Tomato Sauce"; // appending to description
	}
	
	public double getCost(){
		return pizza.getCost() + .50;
	}
}
