package designpatterns.structural.bridge;

public class TestTheRemote {

	public static void main(String[] args) {

		RemoteSetting tvRemote = new TVRemoteMute(new TVDevice(1, 200));
		RemoteSetting tvRemoteTwo = new TVRemotePause(new TVDevice(1, 200));
		
		System.out.println("Test TV with Mute");
		
		tvRemote.buttonFivePressed();
		tvRemote.buttonSixPressed();
		tvRemote.buttonNinePressed();
		
		System.out.println("Test TV with Pause");
		
		tvRemoteTwo.buttonFivePressed();
		tvRemoteTwo.buttonSixPressed();
		tvRemoteTwo.buttonNinePressed();
		tvRemoteTwo.deviceFeedback();
		
	}

}
