package com.test.digimind.testdigimind.controllers;

import com.test.digimind.testdigimind.services.OmdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/omdb")
public class OmdbApiController {

    @Autowired
    OmdbService omdbService;
    @GetMapping("/{name}/{year}")
    public String getFilmsByYearAndName(@PathVariable String name, @PathVariable String year){
       return omdbService.getFilmsByYearAndName(name,year);

    }
    @GetMapping("/details/{imdbID}")
    public String getFilmDetailsWithImdb(@PathVariable String imdbID){

        return omdbService.getFilmDetailsWithImdb(imdbID);
    }

}
