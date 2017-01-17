package com.mgp.client.localclient;

import java.util.ArrayList;
import java.util.Iterator;

import com.mgp.client.Client;
import com.mgp.server.gameengine.TickInfo;
import com.mgp.server.gameengine.TickListener;

public class Localclient extends Client {

	public Localclient() {
		this.listeners = new ArrayList<TickListener>();
	}
	
	@Override
	protected void onTick(TickInfo info) {
		for(Iterator<TickListener> it = this.listeners.iterator(); it.hasNext();) {
			TickListener module = it.next();
			module.onTick(info);
		}
	}

}
