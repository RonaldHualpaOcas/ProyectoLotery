package com.app.lotery.msGenerarJugada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.lotery.msGenerarJugada.model.Play_Entity;

@Repository
public interface PlayRepository extends JpaRepository<Play_Entity, Long>{

}
