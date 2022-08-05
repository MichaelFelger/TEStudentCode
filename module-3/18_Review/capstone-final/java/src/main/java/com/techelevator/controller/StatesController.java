package com.techelevator.controller;

import com.techelevator.dao.CityDao;
import com.techelevator.model.City;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StatesController {

    private CityDao cityDao;

    public StatesController(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @GetMapping(path = "/states/{abv}/cities")
    public List<City> getForState(@PathVariable String abv) {
        List<City> cities = this.cityDao.getCitiesForState(abv);
        if (cities.size() == 0) {
            throw new StateNotFoundException();
        }
        return cities;
    }

}
