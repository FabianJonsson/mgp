package com.mgp.utilities;

public class Physics {

	public static final double GRAVITATIONAL_CONSTANT = 9.82;
	
	public static coordinate GravitationalForce(double mass, double height) {
		coordinate output = new coordinate();
		output.x = 0;
		output.y = 0;
		output.z = -1 * mass * height * GRAVITATIONAL_CONSTANT;
		return output;
	}
	
}
