package com.mgp.utilities;

import java.lang.Math;

public class Vmath {
	
	public static coordinate add(coordinate a, coordinate b) {
		coordinate output = new coordinate();
		output.x = a.x + b.x;
		output.y = a.y + b.y;
		output.z = a.z + b.z;
		return output;
	}
	
	public static coordinate subtract(coordinate a, coordinate b) {
		coordinate output = new coordinate();
		output.x = a.x - b.x;
		output.y = a.y - b.y;
		output.z = a.z - b.z;
		return output;		
	}

	public static coordinate multiply(coordinate a, double b) {
		coordinate output = new coordinate();
		output.x = a.x * b;
		output.y = a.y * b;
		output.z = a.z * b;
		return output;
	}

	public static coordinate multiply(double a, coordinate b) {
		coordinate output = new coordinate();
		output.x = a * b.x;
		output.y = a * b.y;
		output.z = a * b.z;
		return output;
	}
	
	public static coordinate divide(coordinate a, double b) {
		coordinate output = new coordinate();
		output.x = a.x / b;
		output.y = a.y / b;
		output.z = a.z / b;
		return output;
	}
	
	public static double norm(coordinate a) {
		return Math.sqrt(a.x*a.x + a.y*a.y + a.z*a.z);
	}
	
	public static coordinate unitvector(coordinate a) {
		return divide(a, norm(a)); 
	}
	
}
