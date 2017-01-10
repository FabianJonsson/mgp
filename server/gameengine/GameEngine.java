package com.mgp.server.gameengine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GameEngine {

	private List<TickListener> listeners;
	private long lastTimestamp;
	private long lastTickID;
	private TickInfo currentTick;
	
	public GameEngine() {
		this.listeners = new ArrayList<TickListener>();
		this.lastTimestamp = System.nanoTime();
		this.lastTickID = 0;
		this.currentTick = new TickInfo();
		this.currentTick.ID = 0;
		this.currentTick.timeElapsedSincePreviousTickInMilliseconds = 0;
		this.compileTickInfo();
	}
	
	public void run() {
		
		while(true) {
		
			this.compileTickInfo();
			
			// Fixed tick rate (10 ms)
			long dt = 10 - this.currentTick.timeElapsedSincePreviousTickInMilliseconds;
			if(dt > 0) {
				try {
					TimeUnit.MILLISECONDS.sleep(dt);
					this.currentTick.timeElapsedSincePreviousTickInMilliseconds = 10;
					this.lastTimestamp = System.nanoTime();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			this.tick();
			
		}
		
	}
	
	public void addTickListener(TickListener l) {
		this.listeners.add(l);
	}
	
	private void tick() {
		for(Iterator<TickListener> it = this.listeners.iterator(); it.hasNext();) {
			TickListener module = it.next();
			module.onTick(this.currentTick);
		}
	}
	
	private void compileTickInfo() {

		this.currentTick.ID = this.lastTickID + 1;
		
		long currentTime = System.nanoTime();
		this.currentTick.timeElapsedSincePreviousTickInMilliseconds = TimeUnit.NANOSECONDS.toMillis(currentTime - this.lastTimestamp);
		
		this.lastTickID = this.currentTick.ID;
		this.lastTimestamp = currentTime;
		
	}
	
}
