package com.mgp;

import com.mgp.client.graphicsengine.GraphicsEngine;
import com.mgp.client.graphicsengine.naivepcgraphics.CustomShape;
import com.mgp.client.graphicsengine.naivepcgraphics.NaivePCGraphicsEngine;
import com.mgp.client.playerinputengine.PlayerInputEngine;
import com.mgp.client.playerinputengine.PCKeyboard.PCKeyboardAndMouse;
import com.mgp.server.entityengine.PlayerEntity;
import com.mgp.server.gameengine.GameEngine;
import com.mgp.server.gameengineperformanceanalyzer.GameEnginePerformanceAnalyzer;

public class testrun {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		PlayerEntity p = new PlayerEntity();
		
		@SuppressWarnings("unused")
		GraphicsEngine graphics = new NaivePCGraphicsEngine();		
		
		@SuppressWarnings("unused")
		PlayerInputEngine keyboard = new PCKeyboardAndMouse();
		
		//GameEngine game = new GameEngine();
		//@SuppressWarnings("unused")
		//GameEnginePerformanceAnalyzer analyzer = new GameEnginePerformanceAnalyzer(game);
		//game.run();
		
	}

}
