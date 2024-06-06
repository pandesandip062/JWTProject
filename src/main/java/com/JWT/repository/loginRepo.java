package com.JWT.repository;

import com.JWT.Entity2.loginDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface loginRepo extends JpaRepository<loginDetails, Integer> {
}
