package org.launchcode.aotry4.models.data;

import org.launchcode.aotry4.models.Registration;
import org.launchcode.aotry4.models.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface RegistrationDao extends CrudRepository<Registration, Integer>{
}
