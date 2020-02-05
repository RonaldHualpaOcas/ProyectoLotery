package com.app.lotery.msRegistroJugada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.lotery.msRegistroJugada.model.Player_Entity;

@Repository
public interface PlayerRepository extends JpaRepository<Player_Entity, Long>{

}
