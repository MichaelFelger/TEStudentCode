package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // critical annotation to let Spring know that in here are endpoints
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;


    public HotelController() {  // default constructor allows Spring to fire up an instance of this - introspection can tell Spring what is can do
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */

    // ^^ doesn't apply anymore - we are doing custom search/query here now
    // optional stuff isn't a great situation for @PathVariable - searches, narrowed queries, etc.
    // i.e. /hotels?cityName=Cincinnati&state=OH
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list(@RequestParam(required = false) String cityName,
                            @RequestParam(required = false) String stateName) {
        return hotelDao.list(cityName, stateName);
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET) // the {id} here is a place-holder path variable
    public Hotel get(@PathVariable int id) { // pathvariable annotation - id must line up with above {id}
        return hotelDao.get(id);
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> getReservation() {
        return reservationDao.findAll();
    }

    @RequestMapping(path = "/hotels/{hotelID}/reservations", method = RequestMethod.GET)
    public List<Reservation> getReservationsForId(@PathVariable int hotelID) {
        return reservationDao.findByHotel(hotelID);
    }



}
