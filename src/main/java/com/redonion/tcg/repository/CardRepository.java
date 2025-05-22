package com.redonion.tcg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redonion.tcg.model.Card;

public interface CardRepository extends JpaRepository<Card, Long> {
    List<Card> findByIdUser(Integer idUser); // Only this method is needed
}