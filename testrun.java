package com.mgp;

import com.mgp.server.entityengine.PlayerEntity;
import com.mgp.server.gameengine.GameEngine;
import com.mgp.server.gameengineperformanceanalyzer.GameEnginePerformanceAnalyzer;

public class testrun {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		PlayerEntity p = new PlayerEntity();
		
		GameEngine game = new GameEngine();
		@SuppressWarnings("unused")
		GameEnginePerformanceAnalyzer analyzer = new GameEnginePerformanceAnalyzer(game);
		game.run();
		
	}

}
