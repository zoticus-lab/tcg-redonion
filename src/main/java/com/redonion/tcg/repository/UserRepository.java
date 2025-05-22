package com.redonion.tcg.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redonion.tcg.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByNama(String nama);
}