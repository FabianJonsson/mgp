package com.mgp.server.gameengineperformanceanalyzer;

import com.mgp.server.gameengine.GameEngine;
import com.mgp.server.gameengine.TickInfo;
import com.mgp.server.gameengine.TickListener;

public class GameEnginePerformanceAnalyzer implements TickListener {

	public GameEnginePerformanceAnalyzer(GameEngine game) {
		game.addTickListener(this);
	}
	
	public void onTick(TickInfo info) {	
		System.out.println(info.ID + ": " + info.timeElapsedSincePreviousTickInMilliseconds);
	}
	
}
