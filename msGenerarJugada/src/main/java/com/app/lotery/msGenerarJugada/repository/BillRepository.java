package com.app.lotery.msGenerarJugada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.lotery.msGenerarJugada.model.Bill_Entity;

@Repository
public interface BillRepository extends JpaRepository<Bill_Entity, Long>{

}
