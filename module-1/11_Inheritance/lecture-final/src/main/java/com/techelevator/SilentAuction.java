package com.techelevator;

public class SilentAuction extends ReserveAuction {

    private boolean isOpen;

    public SilentAuction(String itemForSale, int reservePrice) {
        super(itemForSale, reservePrice);
        isOpen = true;
    }

    public boolean placeBid(Bid bid) {
        if (isOpen) {
            super.placeBid(bid);
        }
        return false;
    }

    public void stopAuction() {
        isOpen = false;
    }

    public Bid getHighBid() {
        if (isOpen) {
            return null;
        }

        return super.getHighBid();
    }


}
