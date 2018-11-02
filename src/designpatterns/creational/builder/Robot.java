package designpatterns.creational.builder;

public class Robot implements RobotBlueprint {
	
	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;

	
	public Robot() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setRobotHead(String head) {
		robotHead = head;
		
	}

	@Override
	public void setRobotTorso(String torso) {
		robotTorso = torso;
		
	}

	@Override
	public void setRobotArms(String arms) {
		robotArms = arms;
		
	}

	@Override
	public void setRobotLegs(String legs) {
		robotLegs = legs;
		
	}

	public String getRobotHead() {
		return robotHead;
	}

	public String getRobotTorso() {
		return robotTorso;
	}

	public String getRobotArms() {
		return robotArms;
	}

	public String getRobotLegs() {
		return robotLegs;
	}

	
}
