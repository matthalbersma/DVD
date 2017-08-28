package com.matthalbersma.DVD.Spring.Boot.Controllers;

import com.matthalbersma.DVD.Spring.Boot.DTO.Search;
import com.matthalbersma.DVD.Spring.Boot.Service.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class SearchApi {

    @Autowired
    Api api;

    @PostMapping("/search/IMDB")
    public String searchResults(@RequestBody Search search){
        return api.searchTheDb(search);
    }
}
