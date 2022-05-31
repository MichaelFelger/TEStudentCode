package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        ReserveAuction ra = new ReserveAuction("wedding band", 100);
        System.out.println(ra.placeBid(new Bid("john", 75)));
        System.out.println(ra.placeBid(new Bid("paul", 95)));
        System.out.println(ra.placeBid(new Bid("george", 105)));

        System.out.println("===========");
        SilentAuction sa = new SilentAuction("ring of power", 10000);
        System.out.println(sa.getHighBid());
        System.out.println(sa.placeBid(new Bid("john", 5)));
        System.out.println(sa.placeBid(new Bid("john", 10001)));
        System.out.println(sa.getHighBid());
        sa.stopAuction();
        System.out.println(sa.getHighBid().toString());

        System.out.println(new Object());

    }
}
