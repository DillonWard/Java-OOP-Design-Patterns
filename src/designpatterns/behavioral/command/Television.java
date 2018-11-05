package designpatterns.behavioral.command;

public class Television implements Device{

	private int volume = 0;
	
	public Television() {

	}

	@Override
	public void turnOn() {
	System.out.println("TV On");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV Off");
	}

	@Override
	public void volumeUp() {
		volume += 1;
		System.out.println("Volume: " + volume);
	}

	@Override
	public void volumeDown() {
		volume -= 1;
		System.out.println("Volume: " + volume);
	}

}
