package org.launchcode.aotry4.models.data;

import org.launchcode.aotry4.models.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ReservationDao extends CrudRepository<Reservation, Integer> {
    void delete(int reservationId);
}
