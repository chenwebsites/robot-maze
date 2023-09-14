package robot.main;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot();

		while (!robot.hasExited()) {

			for (int i = 0; i < 4; i++) {

				if (robot.isPathClear()) {
					robot.moveForward();
					break;
				}

				for (int j = 0; j <= i; j++) {
					robot.turnLeft();
				}

			}

		}

	}

}
