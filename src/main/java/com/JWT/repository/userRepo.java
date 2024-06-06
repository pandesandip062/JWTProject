package com.JWT.repository;

import com.JWT.Entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface userRepo extends JpaRepository<user,String > {

    public Optional<user> findByEmail(String email);
}
