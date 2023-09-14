package robot.main;

public class Main {

	// I assume the robot begins his walk from the first square at (6,0)
	// and after he enter the maze, the entrence becomes a wall.
	// I assume for each maze, there is an exit. 
	// The robot "walks with his left hand touching" the left wall until he finds
	// the exit.

	public static void main(String[] args) {
		Robot robot = new Robot();

		while (!robot.hasExited()) {

			robot.turnLeft();
			if (robot.isPathClear()) {
				robot.moveForward();
				break;
			} else {
				for (int i = 0; i < 3; i++) {
					robot.turnLeft();
				}
				if (robot.isPathClear()) {
					robot.moveForward();
					break;
				} else {
					for (int i = 0; i < 2; i++) {
						robot.turnLeft();
					}
					if (robot.isPathClear()) {
						robot.moveForward();
						break;
					}
				}

			}

		}

	}

}
