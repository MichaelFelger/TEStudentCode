package com.techelevator.auctions.controller;

import com.techelevator.auctions.dao.AuctionDao;
import com.techelevator.auctions.dao.MemoryAuctionDao;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.techelevator.auctions.dao.MemoryAuctionDao.auctions;

@RestController
@RequestMapping("/auctions")
public class AuctionController {


    private AuctionDao dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDao();
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> getAuctions(@RequestParam(required = false) String title_like,
                                     @RequestParam(required = false) Double currentBid_lte) {
        if (title_like != null && currentBid_lte != null){
            return dao.searchByTitleAndPrice(title_like, currentBid_lte);
        }
        else if (title_like != null) {
            return dao.searchByTitle(title_like);
        }
        else if (currentBid_lte != null) {
            return dao.searchByPrice(currentBid_lte);
        }
        else {
            return dao.list();
        }
    }

    @RequestMapping(path = "{id}", method = RequestMethod.GET)
    public Auction get(@PathVariable int id) {
        return dao.get(id);
    }

    // not adding new auction
    @RequestMapping(path = "", method = RequestMethod.POST)
    public Auction create(@RequestBody Auction auction) {
        if (auction != null) {
            dao.create(auction);
            return auction;
        } return null;
    }



}

