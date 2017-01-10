package com.mgp.server.gameengineperformanceanalyzer;

import com.mgp.server.gameengine.GameEngine;
import com.mgp.server.gameengine.TickInfo;
import com.mgp.server.gameengine.TickListener;

public class GameEnginePerformanceAnalyzer implements TickListener {

	private int tickCounter;
	private long millisecondCounter;
	
	public GameEnginePerformanceAnalyzer(GameEngine game) {
		game.addTickListener(this);
		this.millisecondCounter = 0;
		this.tickCounter = 0;
	}
	
	public void onTick(TickInfo info) {
		this.tickCounter++;
		this.millisecondCounter += info.timeElapsedSincePreviousTickInMilliseconds;
		
		if(this.millisecondCounter >= 1000) {
			System.out.println("Current TPS: " + this.tickCounter);
			this.tickCounter = 0;
			this.millisecondCounter = 0;
		}
	}
	
}
