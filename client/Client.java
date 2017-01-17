package com.mgp.client;

import java.util.List;
import com.mgp.server.gameengine.TickInfo;
import com.mgp.server.gameengine.TickListener;

public abstract class Client {

	protected List<TickListener> listeners;
	
	protected abstract void onTick(TickInfo info);
	
}
