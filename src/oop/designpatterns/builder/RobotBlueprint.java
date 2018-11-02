package oop.designpatterns.builder;

public interface RobotBlueprint {
	
	public void setRobotHead(String head);
	public void setRobotTorso(String torso);
	public void setRobotArms(String arms);
	public void setRobotLegs(String legs);

}
