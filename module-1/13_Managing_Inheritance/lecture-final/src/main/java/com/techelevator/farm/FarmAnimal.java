package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isSleeping = false;
	String defaultAccessString;
	protected String protectedAccessString;


	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName( ) {
		return name;
	}
	public final String getSound( ) {
		if (isSleeping) {
			return "Zzzzzz";
		}
		return sound;
	}

	public void sleep() {
		isSleeping = true;
	}

	public void wakeUp() {
		isSleeping = false;
	}

	public abstract String eat();

}