package com.app.lotery.msGenerarJugada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.lotery.msGenerarJugada.model.Combo_Entity;

@Repository
public interface ComboRepository extends JpaRepository<Combo_Entity, Long>{

}
