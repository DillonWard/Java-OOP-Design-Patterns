package designpatterns.structural.adapter;

public class TestEnemyAttackers {

	public static void main(String[] args) {

		EnemyTank enemyTank  = new EnemyTank();
		EnemyRobot enemyRobot = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);
		
		System.out.println("The Robot");
		enemyRobot.reactToHuman("David");
		enemyRobot.walkForward();
		enemyRobot.smashWithHands();
		
		System.out.println("Enemy Tank");
		enemyTank.assignDriver("Dillon");
		enemyTank.driveForward();
		enemyTank.fireWeapon();
		
		// robot is adapted to be able to use tank classes
		System.out.println("The Robot with Adapter");
		robotAdapter.assignDriver("Daniel");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}

}
