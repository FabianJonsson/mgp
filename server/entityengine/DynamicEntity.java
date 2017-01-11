package com.mgp.server.entityengine;

import com.mgp.utilities.Vmath;
import com.mgp.utilities.coordinate;

public abstract class DynamicEntity extends Entity {
	
	protected double m;
	protected coordinate v,a,F;
	
	@Override
	public void updateState(long timeElapsedSinceLastUpdateInMilliseconds) {
		this.pos = Vmath.add(this.pos, Vmath.multiply(this.v, (double) timeElapsedSinceLastUpdateInMilliseconds));
		this.v = Vmath.add(this.v, Vmath.multiply(this.a, (double) timeElapsedSinceLastUpdateInMilliseconds));
		this.a = Vmath.divide(this.F, this.m);
	}
	
	public void addForce(coordinate Fi) {
		this.F = Vmath.add(F, Fi);
	}

}
