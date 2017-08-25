package com.matthalbersma.DVD.Spring.Boot.Service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ApiService {
    private RestTemplate restTemplate = new RestTemplate();
    private String url ="";
    private String searchForMovie(String movie){
        url += movie;
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class );
        return response.getBody();
    }
}
