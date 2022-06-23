package com.test.digimind.testdigimind.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class FilmResponse implements Serializable {
    private String genre;
    private int nombre;
}
