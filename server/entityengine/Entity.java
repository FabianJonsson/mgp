package com.mgp.server.entityengine;

import com.mgp.utilities.coordinate;

public abstract class Entity {

	// META DATA
	protected long typeID;

	// UNIQUE ENTITY INSTANCE DATA
	protected long ID;
	protected coordinate pos;
	
	// Entity API
	public Entity() {
		this.initState();
	}
	public abstract void updateState(long timeElapsedSinceLastUpdateInMilliseconds);
	public abstract void initState();
	
}
