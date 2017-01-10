package com.mgp.server.entityengine;

import com.mgp.server.gameengine.GameEngine;
import com.mgp.server.gameengine.TickInfo;
import com.mgp.server.gameengine.TickListener;

public class EntityEngine implements TickListener {
	
	public EntityEngine(GameEngine game) {
		game.addTickListener(this);
	}
	
	public void onTick(TickInfo info) {
	}

}
