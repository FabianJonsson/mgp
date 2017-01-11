package com.mgp.server.entityengine;

public class PlayerEntity extends DynamicEntity {

	public PlayerEntity() {
		super();
	}

	@Override
	public void initState() {
		System.out.println("Test - this is initState() in PlayerEntity");
	}
	
}
