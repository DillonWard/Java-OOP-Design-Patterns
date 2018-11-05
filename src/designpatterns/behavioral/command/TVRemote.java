package designpatterns.behavioral.command;

public class TVRemote {

	public static Device getDevice(){
		return new Television();
	}
}
