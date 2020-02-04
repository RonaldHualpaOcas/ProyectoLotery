package com.app.lotery.msConsultaJugada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.lotery.msConsultaJugada.model.Combo_Entity;
import com.app.lotery.msConsultaJugada.repository.comboRepository;


@RestController
@RequestMapping("/Lotery/v1/CheckPlay")
public class play_query_controller {
	
	@Autowired
	private comboRepository comboRepository;
	
	 @GetMapping("/Combos")
	   public List<Combo_Entity> getAllConsultas() {
	     return comboRepository.findAll();
	 }
	   
	   @GetMapping("/ComboPerUser/{id}")
	   public List<Object[]> getConsultaUsuario(@PathVariable(value = "id") Long user_id) {
	     return comboRepository.fetchComboDataInnerJoin(user_id);
	 }
}
