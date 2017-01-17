package com.mgp.client.localclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

import com.mgp.client.Client;
import com.mgp.server.gameengine.TickInfo;
import com.mgp.server.gameengine.TickListener;

public class Localclient extends Client {

	public Localclient() {
		this.listeners = new ArrayList<TickListener>();
	}
	
	public void run() {
		try (
			Socket kkSocket = new Socket("LOCALHOST", 4444);
			PrintWriter out = new PrintWriter(kkSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(
			new InputStreamReader(kkSocket.getInputStream()));
		) {
			String fromServer, fromUser;
			while ((fromServer = in.readLine()) != null) {
				System.out.println("Server: " + fromServer);
				if (fromServer.equals("Bye."))
					break;
		
				fromUser = System.in.toString();
				if (fromUser != null) {
					System.out.println("Client: " + fromUser);
					out.println(fromUser);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void onTick(TickInfo info) {
		for(Iterator<TickListener> it = this.listeners.iterator(); it.hasNext();) {
			TickListener module = it.next();
			module.onTick(info);
		}
	}

}
