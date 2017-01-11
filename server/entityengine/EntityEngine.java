package com.mgp.server.entityengine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.mgp.server.gameengine.GameEngine;
import com.mgp.server.gameengine.TickInfo;
import com.mgp.server.gameengine.TickListener;

public class EntityEngine implements TickListener {
	
	private List<Entity> entities;
	
	public EntityEngine(GameEngine game) {
		this.entities = new ArrayList<Entity>();
		game.addTickListener(this);
	}
	
	public void onTick(TickInfo info) {
		for(Iterator<Entity> it = this.entities.iterator(); it.hasNext();) {
			Entity entity = it.next();
			entity.updateState(info.timeElapsedSincePreviousTickInMilliseconds);
		}
	}

}
