package com.matthalbersma.DVD.Spring.Boot.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Null;

@Entity
@Data
public class Dvd {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String imdb;
    private String description;
    private String released;
    private String imageUrl;
    private String mpaa;

}
