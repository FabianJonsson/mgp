package com.mgp.server;

import java.util.List;

import com.mgp.client.Client;
import com.mgp.server.gameengine.TickListener;

public abstract class Server implements TickListener {

	protected List<TickListener> serverSideListeners;
	protected List<Client> clients;
	
	public abstract void addClient(Client c);
	public abstract void sendMessageToClient(Client c, String msg);
	
}
