package com.em.SBValidateExpHandling.Repository;

import com.em.SBValidateExpHandling.Model.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInformation,Integer> {
}
