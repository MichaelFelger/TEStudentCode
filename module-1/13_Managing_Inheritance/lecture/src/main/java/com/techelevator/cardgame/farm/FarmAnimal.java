package com.techelevator.cardgame.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isSleeping = false;

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
		isSleeping =  false;
	}
	public abstract String eat();  // this forces the subclass to deal with it - must provide what they eat


}