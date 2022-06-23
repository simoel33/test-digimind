package com.test.digimind.testdigimind.controllers;

import com.test.digimind.testdigimind.services.FilmsFromJsonFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/films")
public class FilmsFromJsonFileController {

    @Autowired
    FilmsFromJsonFileService filmsFromJsonFileService;

    @GetMapping("/{filmeName}")
    int getFilmsCountByGenre(@PathVariable String filmeName){
        return filmsFromJsonFileService.getFilmsCountByGenre(filmeName);
    }
}
