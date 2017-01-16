package com.mgp.client.graphicsengine.naivepcgraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class CustomShape {

	Polygon shape;
	
	public CustomShape() {
		int xPoly[] = {150, 250, 325, 375, 450, 275, 100};
	    int yPoly[] = {150, 100, 125, 225, 250, 375, 300};
	    this.shape = new Polygon(xPoly, yPoly, xPoly.length);
	}
	
	public void paint(Graphics g) {
	    g.setColor(Color.BLUE);
	    g.drawPolygon(this.shape);
	}
	
}
