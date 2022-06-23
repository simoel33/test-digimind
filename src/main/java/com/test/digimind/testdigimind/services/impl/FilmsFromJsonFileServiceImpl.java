package com.test.digimind.testdigimind.services.impl;

import com.test.digimind.testdigimind.repositories.FilmsFromJsonFileRepository;
import com.test.digimind.testdigimind.responses.FilmResponse;
import com.test.digimind.testdigimind.services.FilmsFromJsonFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmsFromJsonFileServiceImpl implements FilmsFromJsonFileService {

    @Autowired
    FilmsFromJsonFileRepository filmsFromJsonFileRepository;
    @Override
    public FilmResponse getFilmsCountByGenre(String filmeNmae) {
        return filmsFromJsonFileRepository.getFilmsCountByGenre(filmeNmae);
    }
}
