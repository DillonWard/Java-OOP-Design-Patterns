package designpatterns.structural.bridge;

public class TVRemotePause extends RemoteSetting{

	public TVRemotePause(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV Paused");
	}


}
