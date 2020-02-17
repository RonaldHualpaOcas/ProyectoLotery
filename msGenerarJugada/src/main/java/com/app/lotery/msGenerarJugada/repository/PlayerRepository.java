package com.app.lotery.msGenerarJugada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.lotery.msGenerarJugada.model.Player_Entity;

@Repository
public interface PlayerRepository extends JpaRepository<Player_Entity, Long>{

}
