package com.mgp.client.graphicsengine.naivepcgraphics;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JPanel;

import com.mgp.client.ClientSettings;

public class Canvas extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private List<CustomShape> shapes;
	
	@Override
    public Dimension getPreferredSize() {
        return new Dimension(ClientSettings.SCREEN_WIDTH, ClientSettings.SCREEN_HEIGHT);
    }
	
	public Canvas() {
		super();
		this.shapes = new ArrayList<CustomShape>();
	}
	
	public void addShape(CustomShape s) {
		this.shapes.add(s);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(Iterator<CustomShape> it = this.shapes.iterator(); it.hasNext();) {
			CustomShape shape = it.next();
			shape.paint(g);
		}
		
	}

}
