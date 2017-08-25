package com.matthalbersma.DVD.Spring.Boot.Models;

import org.hibernate.validator.constraints.Email;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

/**
 * Created by walter on 8/24/17.
 */

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String firstName;
    private String lastName;
    @Email
    private String email;
//    @ManyToMany
//    private List<Roles> roles;
    private String password;


}
