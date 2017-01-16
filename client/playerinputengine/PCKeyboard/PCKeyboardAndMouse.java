package com.mgp.client.playerinputengine.PCKeyboard;

import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;

import com.mgp.client.playerinputengine.PlayerInputEngine;

public class PCKeyboardAndMouse extends PlayerInputEngine {

	public PCKeyboardAndMouse() {

		AWTEventListener listener = new AWTEventListener() {
			@Override
			public void eventDispatched(AWTEvent event) {
				try {
					KeyEvent evt = (KeyEvent)event;
					if(evt.getID() == KeyEvent.KEY_PRESSED && evt.getKeyCode() == KeyEvent.VK_W) {
						System.out.println("Move forward");
					}
					if(evt.getID() == KeyEvent.KEY_PRESSED && evt.getKeyCode() == KeyEvent.VK_A) {
						System.out.println("Move left");
					}
					if(evt.getID() == KeyEvent.KEY_PRESSED && evt.getKeyCode() == KeyEvent.VK_S) {
						System.out.println("Move back");
					}
					if(evt.getID() == KeyEvent.KEY_PRESSED && evt.getKeyCode() == KeyEvent.VK_D) {
						System.out.println("Move right");
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		};

		Toolkit.getDefaultToolkit().addAWTEventListener(listener, AWTEvent.KEY_EVENT_MASK);
		
	}
	
}
