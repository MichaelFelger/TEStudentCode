package com.techelevator;

public class ReserveAuction extends Auction {

    private int reservePrice;

    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid bid) {  //accept bid, create helper variable and set to false
        boolean isWinningBid = false;
        if (bid.getBidAmount() >= this.reservePrice) { // if reserve met, then we delegate function back to the superclass
            isWinningBid =  super.placeBid(bid);
        }
        return isWinningBid;
    }
}
