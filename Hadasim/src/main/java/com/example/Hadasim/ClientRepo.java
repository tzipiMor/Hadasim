package com.example.Hadasim;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {
    //Optional<Client> findClientByCellPhone(String cellPhone);

    Optional<Client> findByCoronaVaccine(String coronaVaccine);

    //Optional<Client> findById(String coronaVaccine);
    //@Query("SELECT c FROM Client c WHERE " + "CONCAT(c.firstName, c.lastName, c.id, c.city, c.street, c.numOfHouse, c.dateOfBirth, c.phone, c.cellPhone)" + "LIKE %?1%")

}
