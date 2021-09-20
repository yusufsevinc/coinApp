package com.example.coin.repository;

import com.example.coin.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users , Long> {
    Optional<Users> findByUsernameAndPassword(String userName , String password);
    Optional<Users> findByUsername(String userName);
}
