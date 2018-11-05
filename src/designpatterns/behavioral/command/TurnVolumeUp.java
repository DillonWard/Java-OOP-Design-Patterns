package designpatterns.behavioral.command;

public class TurnVolumeUp implements Command{

	Device device;
	
	public TurnVolumeUp(Device device) {
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeUp();
	}

}
