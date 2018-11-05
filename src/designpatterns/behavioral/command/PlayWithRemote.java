package designpatterns.behavioral.command;

public class PlayWithRemote {

	public static void main(String[] args) {
		Device device = TVRemote.getDevice();
		
		TurnTVOn onCommand = new TurnTVOn(device);
		DeviceButton onPressed = new DeviceButton(onCommand);
		onPressed.press();
		
		TurnTVOff offCommand = new TurnTVOff(device);
		onPressed = new DeviceButton(offCommand);
		onPressed.press();
		
		TurnVolumeUp volumeUp = new TurnVolumeUp(device);
		onPressed = new DeviceButton(volumeUp);
		
		for(int i = 0; i < 4; i++)
			onPressed.press();
		
		TurnVolumeDown volumeDown = new TurnVolumeDown(device);
		onPressed = new DeviceButton(volumeDown);
		
		for(int i = 0; i < 3; i++)
			onPressed.press();
	}

}
