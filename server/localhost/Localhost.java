package com.mgp.server.localhost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
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

	public void run() {
		int portNumber = 4444;

		try ( 
		    ServerSocket serverSocket = new ServerSocket(portNumber);
		    Socket clientSocket = serverSocket.accept();
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		) {
			String inputLine, outputLine;
			while ((inputLine = in.readLine()) != null) {
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	  
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
