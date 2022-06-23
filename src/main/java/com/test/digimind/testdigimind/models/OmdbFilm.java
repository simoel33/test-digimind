package com.test.digimind.testdigimind.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OmdbFilm implements Serializable {
    private String Title;
    private String Year;
    private String Genre;
    private String Type;
    private String Poster;
    private String imdbID;

}
