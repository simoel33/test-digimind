package com.test.digimind.testdigimind.services;



public interface OmdbService {
    public String getFilmsByYearAndName(String name,String year);
    public String getFilmDetailsWithImdb( String imdbID);
}
