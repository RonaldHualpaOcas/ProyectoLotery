package com.app.lotery.msGenerarJugada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.lotery.msGenerarJugada.model.Main_Entity;

@Repository
public interface MainRepository extends JpaRepository<Main_Entity, Long>{

}
