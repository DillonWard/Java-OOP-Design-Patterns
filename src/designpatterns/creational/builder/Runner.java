package designpatterns.creational.builder;

public class Runner {

	public static void main(String[] args) {

		RobotBuilder oldRobot = new OldRobotBuilder();
		RobotBuilderImplementation robotMaker = new RobotBuilderImplementation(oldRobot);
		robotMaker.makeRobot();
		Robot firstRobot = robotMaker.getRobot();
		
		System.out.println("Head: " + firstRobot.getRobotHead());
		System.out.println("Torse: " + firstRobot.getRobotTorso());
		System.out.println("Arms: " + firstRobot.getRobotArms());
		System.out.println("Legs: " + firstRobot.getRobotLegs());
	}

}
