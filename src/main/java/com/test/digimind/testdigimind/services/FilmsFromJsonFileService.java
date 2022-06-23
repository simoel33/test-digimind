package com.test.digimind.testdigimind.services;

import com.test.digimind.testdigimind.responses.FilmResponse;

public interface FilmsFromJsonFileService {
    FilmResponse getFilmsCountByGenre(String filmeNmae);
}
