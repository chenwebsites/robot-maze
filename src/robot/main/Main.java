package robot.main;

public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot();
		int[] sequence = { 1, 3, 3, 3};

		while (!robot.hasExited()) {

			for (int count : sequence) {
				for (int i = 0; i < count; i++) {
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
