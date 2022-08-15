package org.launchcode.aotry4.models.data;

import org.launchcode.aotry4.models.Registration;
import org.launchcode.aotry4.models.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RegistrationDao extends CrudRepository<Registration, Integer>{
    void delete(int userId);
}
