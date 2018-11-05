package designpatterns.behavioral.command;

public class TurnVolumeDown implements Command{

	Device device;
	
	public TurnVolumeDown(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeDown();
	}

}
