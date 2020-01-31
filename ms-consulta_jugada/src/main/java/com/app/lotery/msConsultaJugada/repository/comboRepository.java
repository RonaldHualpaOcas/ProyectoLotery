package com.app.lotery.msConsultaJugada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.lotery.msConsultaJugada.model.Combo_Entity;

@Repository
public interface comboRepository extends JpaRepository<Combo_Entity, Long>{

}
