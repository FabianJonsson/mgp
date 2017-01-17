package com.mgp.client.graphicsengine.naivepcgraphics;

import com.mgp.client.graphicsengine.GraphicsEngine;
import com.mgp.server.gameengine.TickInfo;

public class NaivePCGraphicsEngine extends GraphicsEngine{
	
	public NaivePCGraphicsEngine() {
		Screen testwindow = new Screen();
		Canvas testcanvas = new Canvas();
		testwindow.add(testcanvas);
		testcanvas.addShape(new CustomShape());
	}

	@Override
	public void onTick(TickInfo info) {
		// TODO Auto-generated method stub
		
	}
	
}
