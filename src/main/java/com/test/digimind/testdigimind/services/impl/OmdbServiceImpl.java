package com.test.digimind.testdigimind.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.digimind.testdigimind.constants.Constants;
import com.test.digimind.testdigimind.models.JsonFilm;
import com.test.digimind.testdigimind.models.OmdbFilm;
import com.test.digimind.testdigimind.services.OmdbService;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Service
public class OmdbServiceImpl implements OmdbService {
    @Override
    public String getFilmsByYearAndName(String name, String year) {
       return sendGetRequest(Constants.baseURl+Constants.apiKey+"s="+name+"&y="+year);
    }

    @Override
    public String getFilmDetailsWithImdb(String imdbID) {
        return  sendGetRequest(Constants.baseURl+Constants.apiKey+"i="+imdbID);
    }

    public String sendGetRequest(String requestUrl)
    {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            URL url = new URL(requestUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept","*/*");
            httpURLConnection.setRequestProperty("Content-Type","Application/json; charset=UTF-8");
            InputStream inputStream = httpURLConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                stringBuffer.append(line);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
