package oop.designpatterns.builder;

public class RobotBuilderImplementation {

	private RobotBuilder robotBuilder;
	
	public RobotBuilderImplementation(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}

	public Robot getRobot(){
		return this.robotBuilder.getRobot();
	}
	
	public void makeRobot(){
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
		this.robotBuilder.buildRobotTorso();
	}
}
