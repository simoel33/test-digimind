package com.test.digimind.testdigimind.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.digimind.testdigimind.models.JsonFilm;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.client.RestTemplate;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FilmsFromJsonFileRepository {
    @Autowired
    ResourceLoader resourceLoader;


    public int getFilmsCountByGenre(String filmeNmae) {
        int count =0;
        try {
            Resource resource = resourceLoader.getResource("classpath:films.json");
            InputStream inputStream = new FileInputStream(resource.getFile());
            ObjectMapper mapper = new ObjectMapper();
            List<JsonFilm> jsonFilms = mapper.readValue(inputStream, new TypeReference<List<JsonFilm>>() {
            });
            String genreFilme = "";
            for(JsonFilm film:jsonFilms){
                if (film.getTitle().contains(filmeNmae)) {
                    genreFilme = film.getGenre();
                    break;
                }
            }
            // we test if the film exist
            if (genreFilme!=null){
                for(JsonFilm film:jsonFilms){
                    if (film.getGenre().contains(genreFilme)) {
                        count++;
                    }
                }
            }

            System.out.println(genreFilme);

        } catch (IOException e) {
            e.printStackTrace();
        }


        return count;
    }
}
