package designpatterns.behavioral.command;

public class TurnTVOn implements Command{

	Device device;
	
	public TurnTVOn(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.turnOn();
	}

}
