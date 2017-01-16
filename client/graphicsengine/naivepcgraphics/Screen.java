package com.mgp.client.graphicsengine.naivepcgraphics;

import java.awt.Color;

import javax.swing.JFrame;

public class Screen extends JFrame {

	private static final long serialVersionUID = 1L;

	public Screen() {
		setSize(640, 480);
		setResizable(false);
		setTitle("3D Engine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.black);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}
