package com.matthalbersma.DVD.Spring.Boot.Service;

import com.matthalbersma.DVD.Spring.Boot.DTO.Search;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Api {
    private RestTemplate restTemplate = new RestTemplate();
    private String url = "https://api.themoviedb.org/3/search/multi?api_key=1c91d59c639062ea5cfb315f3d75e555&query=";

    public String searchTheDb(Search search){
        String toSearch = url + search.getSearch() +"&page="+search.getPage();
        ResponseEntity<String> response = restTemplate.getForEntity(toSearch, String.class );
        return response.getBody();
    }


}
