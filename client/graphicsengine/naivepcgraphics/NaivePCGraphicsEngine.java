package com.mgp.client.graphicsengine.naivepcgraphics;

import com.mgp.client.graphicsengine.GraphicsEngine;

public class NaivePCGraphicsEngine extends GraphicsEngine{
	
	public NaivePCGraphicsEngine() {
		Screen testwindow = new Screen();
		Canvas testcanvas = new Canvas();
		testwindow.add(testcanvas);
		testcanvas.addShape(new CustomShape());
	}
	
}
