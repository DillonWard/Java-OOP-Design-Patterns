package designpatterns.structural.decorator;

abstract class ToppingsDecorator implements Pizza{

	protected Pizza pizza;
	
	public ToppingsDecorator(Pizza pizza){
		
		this.pizza = pizza;
	}
	
	public String getDescription(){
		
		return pizza.getDescription();
	}
	
	public double getCost(){
		return pizza.getCost();
	}
}
