package designpatterns.structural.bridge;

public abstract class RemoteSetting {

	private EntertainmentDevice device;
	
	public RemoteSetting(EntertainmentDevice device) {
		
		this.device = device;
	}
	
	public void buttonFivePressed(){
		
		device.buttonFivePressed();
	}
	
	public void buttonSixPressed(){

		device.buttonSixPressed();
	}
	
	public void deviceFeedback(){
		
		device.deviceFeedback();
	}
	
	public abstract void buttonNinePressed();

}
