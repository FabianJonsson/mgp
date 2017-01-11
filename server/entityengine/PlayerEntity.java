package com.mgp.server.entityengine;

import com.mgp.utilities.Vmath;
import com.mgp.utilities.coordinate;

public class PlayerEntity extends Entity {

	private double m;
	private coordinate v,a,F;
	
	public PlayerEntity() {
		super();
		this.typeID = 1;
		this.ID = 1;
		this.m = 1;
		this.pos = new coordinate(0.0, 0.0, 0.0);
		this.v = new coordinate(0.0, 0.0, 0.0);
		this.a = new coordinate(0.0, 0.0, 0.0);
		this.F = new coordinate(0.0, 0.0, 0.0);
	}
	
	public void updateState(long timeElapsedSinceLastUpdateInMilliseconds) {
		this.pos = Vmath.add(this.pos, Vmath.multiply(this.v, (double) timeElapsedSinceLastUpdateInMilliseconds));
		this.v = Vmath.add(this.v, Vmath.multiply(this.a, (double) timeElapsedSinceLastUpdateInMilliseconds));
		this.a = Vmath.divide(this.F, this.m);
	}
	
	public void addForce(coordinate Fi) {
		this.F = Vmath.add(F, Fi);
	}
	
}
