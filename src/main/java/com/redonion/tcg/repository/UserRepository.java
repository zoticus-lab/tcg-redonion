package com.redonion.tcg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redonion.tcg.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username); // Jika Anda menyimpan username
    
}
