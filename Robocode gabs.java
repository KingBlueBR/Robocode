package sample;


import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

import java.awt.*;


/**
 * Walls - A sample robot that demonstrates a wall-following movement pattern.
 * <p>
 * This robot navigates around the perimeter of the battlefield with the gun pointed inward.
 *
 * @author Mathew A. Nelson (original)
 * @author Flemming N. Larsen (contributor)
 */
public class Walls extends Robot {

	boolean peek; // Flag to determine if scanning is needed before turning
	double moveAmount; // The maximum distance to move along a wall

	/**
	 * run: Navigates the robot around the battlefield perimeter
	 */
	public void run() {
		// Set colors
		setBodyColor(Color.black);
		setGunColor(Color.white);
		setRadarColor(Color.black);
		setBulletColor(Color.yellow);
		setScanColor(Color.white);

		// Set movement distance to the maximum battlefield dimension
		moveAmount = Math.max(getBattleFieldWidth(), getBattleFieldHeight());
		// Initialize scanning flag to false
		peek = false;

		// Align with a wall by turning to face it directly
		// Using modulo to calculate the angle needed to face a wall
		turnLeft(getHeading() % 90);
		ahead(moveAmount);
		// Enable scanning before turning
		peek = true;
		// Point gun toward the battlefield center
		turnGunRight(90);
		// Turn to move along the next wall
		turnRight(90);

		while (true) {
			// Enable scanning before moving along the wall
			peek = true;
			// Move along the current wall
			ahead(moveAmount);
			// Disable scanning during turning
			peek = false;
			// Turn 90 degrees to follow the next wall
			turnRight(90);
		}
	}

	/**
	 * onHitRobot: Handles collision with another robot by moving away
	 */
	public void onHitRobot(HitRobotEvent e) {
		// If the other robot is in front of us, move backward
		if (e.getBearing() > -90 && e.getBearing() < 90) {
			back(100);
		} // If the other robot is behind us, move forward
		else {
			ahead(100);
		}
	}

	/**
	 * onScannedRobot: Fires at the detected robot and performs additional scanning when needed
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Fire at the detected robot with power level 2
		fire(2);
		// Scan is automatically called during movement, but we need an additional scan
		// when the peek flag is true to detect robots before turning or moving toward a new wall
		if (peek) {
			scan();
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {

    double distancia = e.getDistance();

    if (distancia < 100) {
        fire(1);
    } else {
        fire(3);
    }
}
}
