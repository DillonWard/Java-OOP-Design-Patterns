package designpatterns.structural.decorator;

public class PlainPizza implements Pizza {

	public PlainPizza() {

	}

	@Override
	public String getDescription() {
		return "Thin Dough";
	}

	@Override
	public double getCost() {
		return 4.00;
	}

}
