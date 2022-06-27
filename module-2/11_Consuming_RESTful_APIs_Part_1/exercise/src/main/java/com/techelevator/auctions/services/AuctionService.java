package com.techelevator.auctions.services;

import org.springframework.web.client.RestTemplate;

import com.techelevator.auctions.model.Auction;

public class AuctionService {

    public static final String API_BASE_URL = "http://localhost:3000/auctions/";
    private RestTemplate restTemplate = new RestTemplate();


    public Auction[] getAllAuctions() {
        Auction[] auctions = restTemplate.getForObject(API_BASE_URL, Auction[].class);
        return auctions;
    }

    public Auction getAuction(int id) {
        String endpointUrl = API_BASE_URL + id;
        return restTemplate.getForObject(endpointUrl, Auction.class);
    }

    public Auction[] getAuctionsMatchingTitle(String title) {
        String endpointUrl = API_BASE_URL + "?title_like=" + title;
        Auction[] auctions = restTemplate.getForObject(endpointUrl, Auction[].class);
        return auctions;
    }

    public Auction[] getAuctionsAtOrBelowPrice(double price) {
        String endpointUrl = API_BASE_URL + "?currentBid_lte=" + price;
        Auction[] auctions = restTemplate.getForObject(endpointUrl, Auction[].class);
        return auctions;
    }

}
