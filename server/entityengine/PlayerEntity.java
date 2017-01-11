package com.mgp.server.entityengine;

public class PlayerEntity extends DynamicObject {

	public PlayerEntity() {
		super();
	}

	@Override
	public void initState() {
		System.out.println("Test - this is initState() in PlayerEntity");
	}
	
}
