package org.launchcode.aotry4.models.data;

import org.launchcode.aotry4.models.Account;
import org.launchcode.aotry4.models.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface AccountDao extends CrudRepository<Account, Integer> {
}
