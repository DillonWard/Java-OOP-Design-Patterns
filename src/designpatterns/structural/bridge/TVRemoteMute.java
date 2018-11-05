package designpatterns.structural.bridge;

public class TVRemoteMute extends RemoteSetting{


	public TVRemoteMute(EntertainmentDevice device) {
		super(device);
	}

	@Override
	public void buttonNinePressed() {
		System.out.println("TV Muted");
	}

}
