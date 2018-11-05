package designpatterns.structural.bridge;

public class TVDevice extends EntertainmentDevice{

	public TVDevice(int newDeviceState, int newMaxSetting) {
		
		deviceState = newDeviceState;
		maxSetting = newMaxSetting;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buttonFivePressed() {

		System.out.println("Channel Down");
		
		deviceState--;
		
	}

	@Override
	public void buttonSixPressed() {

		System.out.println("Channel Up");
		
		deviceState++;
		
	}

}
