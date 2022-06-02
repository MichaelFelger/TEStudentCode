package com.techelevator.cardgame.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Sellable {
	private BigDecimal price;

	public Cow() {
		super("Cow", "moo!");
		price = new BigDecimal("1500.00");
	}

	public String eat() {
		return "grass";
	}

	public BigDecimal getPrice() {
		return price;
	}
}
