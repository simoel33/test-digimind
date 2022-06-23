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
public class JsonFilm implements Serializable {
    private String title;
    private String year;
    private String genre;
    private String type;

}
