package com.techelevator;

public class ReserveAuction extends Auction {

    private int reservePrice;

    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid bid) {
        boolean isWinningBid = false;
        if (bid.getBidAmount() >= this.reservePrice) {
            isWinningBid = super.placeBid(bid);
        }
        return isWinningBid;
    }

}
