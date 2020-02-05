package com.app.lotery.msConsultaJugada.controller;

import java.util.ArrayList;
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
	   public List<Combo_Entity> getConsultaUsuario(@PathVariable(value = "id") Long user_id) {
		   List<Object[]> listaObjetosBD = comboRepository.fetchComboDataInnerJoin(user_id);
		   List<Combo_Entity> listaResultado = new ArrayList<Combo_Entity>();
		   
		   for (int i=0; i<listaObjetosBD.size(); i++) {
			   Object[] objeto1 = listaObjetosBD.get(i);
			   long id = (long)objeto1[0];
			   int cantidad = (int)objeto1[1];
			   int[] numeros = (int[])objeto1[2];
			   String modo = (String)objeto1[3];
			   Combo_Entity nuevaEntidad = new Combo_Entity(id, cantidad, numeros, modo);
			   listaResultado.add(nuevaEntidad);
		   }
	     return listaResultado;
	 }	   
}
