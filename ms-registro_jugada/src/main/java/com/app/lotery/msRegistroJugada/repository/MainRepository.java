package com.app.lotery.msRegistroJugada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.lotery.msRegistroJugada.model.Main_Entity;

@Repository
public interface MainRepository extends JpaRepository<Main_Entity, Long>{

}
