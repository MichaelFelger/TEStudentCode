package com.techelevator;

public class Bid {

	private String bidder;
	private int bidAmount;

	//constructor
	public Bid(String bidder, int bidAmount) {
		this.bidder = bidder;
		this.bidAmount = bidAmount;
	}

	//getters
	public String getBidder() {
		return bidder;
	}

	public int getBidAmount() {
		return bidAmount;
	}

	@Override
	public String toString() {
		return String.format("%s %s", bidder, bidAmount);
	}
}
