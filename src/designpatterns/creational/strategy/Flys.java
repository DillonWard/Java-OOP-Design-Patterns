package designpatterns.creational.strategy;

public interface Flys {

	String fly();
}

class CanFly implements Flys{

	public String fly() {

		return "Flying";
	}
	
}

class CantFly implements Flys{
	
	public String fly(){
		
		return "Can't fly";
	}
}
