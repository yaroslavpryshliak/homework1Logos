package robot;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot();
		CoffeRobot robot1 = new CoffeRobot();
		RobotDancer robot2 = new RobotDancer();
		RobotCoocker robot3 = new RobotCoocker();
		robot.work();
		robot1.work();
		robot2.work();
		robot3.work();
	}
}
