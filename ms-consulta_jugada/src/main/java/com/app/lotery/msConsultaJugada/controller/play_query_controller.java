package com.app.lotery.msConsultaJugada.controller;

//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;*/
import org.springframework.web.bind.annotation.GetMapping;
/*import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;*/
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

	  /*  @GetMapping("/consultas/{id}")
	    public ResponseEntity<Consulta> getConsultaById(@PathVariable(value = "id") Long player_id)
	        throws ResourceNotFoundException {
	        Consulta consulta = consultaRepository.findById(player_id)
	          .orElseThrow(() -> new ResourceNotFoundException("Player not found for this id :: " + player_id));
	        return ResponseEntity.ok().body(consulta);
	    }*/
}
