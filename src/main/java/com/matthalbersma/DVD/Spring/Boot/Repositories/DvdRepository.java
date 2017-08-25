package com.matthalbersma.DVD.Spring.Boot.Repositories;

import com.matthalbersma.DVD.Spring.Boot.Models.Dvd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DvdRepository extends JpaRepository<Dvd, Long> {

}
