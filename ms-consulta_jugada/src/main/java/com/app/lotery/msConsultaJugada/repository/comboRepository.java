package com.app.lotery.msConsultaJugada.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.app.lotery.msConsultaJugada.model.Combo_Entity;

@Repository
public interface comboRepository extends JpaRepository<Combo_Entity, Long>{
	@Query("select c.combo_id, c.quantity_selected, c.chosen_numbers, c.mode\r\n" + 
			"from Play_Entity p, Combo_Entity c, Player_Entity pl\r\n" + 
			"where p.fk_player = pl.user_id\r\n" + 
			"and p.fk_combo = c.combo_id\r\n" + 
			"and pl.user_id = ?1")
	public List<Object[]> fetchComboDataInnerJoin(long id);
}
