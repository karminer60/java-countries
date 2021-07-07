package com.lambdaschool.country.repositories;

import com.lambdaschool.country.models.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Long>
{

}
