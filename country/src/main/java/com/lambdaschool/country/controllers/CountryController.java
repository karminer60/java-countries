package com.lambdaschool.country.controllers;

import com.lambdaschool.country.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController
{
    @Autowired
    CountryRepository conrepos;
//http://localhost:2019/names/all
    @GetMapping(value = "/names/all",
    produces = {"application/json"})
    public ResponseEntity<?> listAllCountries()
    {
        List<Country> myList = new ArrayList<>();
        conrepos.findAll().forEachRemaining(myList::add);
        myList.sort(e1, e2) -> e1.getLname().compareToIgnoreCase(e2.getLanme()));
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }
}
