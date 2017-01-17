package com.mgp.server.localhost;

import java.util.ArrayList;
import java.util.Iterator;

import com.mgp.client.Client;
import com.mgp.server.Server;
import com.mgp.server.gameengine.TickInfo;
import com.mgp.server.gameengine.TickListener;

public class Localhost extends Server {

	public Localhost() {
		this.serverSideListeners = new ArrayList<TickListener>();
		this.clients = new ArrayList<Client>();
	}
	
	@Override
	public void addClient(Client c) {
		// TODO: implement some sort of registration function for a client.
	}
	
	@Override
	public void sendMessageToClient(Client c, String msg) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void onTick(TickInfo info) {
		for(Iterator<TickListener> it = this.serverSideListeners.iterator(); it.hasNext();) {
			TickListener module = it.next();
			module.onTick(info);
		}
		for(Iterator<Client> it = this.clients.iterator(); it.hasNext();) {
			Client module = it.next();
			this.sendMessageToClient(module, "Tick");
		}
	}

}
