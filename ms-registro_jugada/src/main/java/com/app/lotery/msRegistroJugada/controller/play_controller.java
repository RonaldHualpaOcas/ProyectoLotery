package com.app.lotery.msRegistroJugada.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.lotery.msRegistroJugada.exception.ResourceNotFoundException;
import com.app.lotery.msRegistroJugada.model.Bill_Entity;
import com.app.lotery.msRegistroJugada.model.Combo_Entity;
import com.app.lotery.msRegistroJugada.model.Main_Entity;
import com.app.lotery.msRegistroJugada.model.Play_Entity;
import com.app.lotery.msRegistroJugada.repository.BillRepository;
import com.app.lotery.msRegistroJugada.repository.ComboRepository;
import com.app.lotery.msRegistroJugada.repository.MainRepository;
import com.app.lotery.msRegistroJugada.repository.PlayRepository;

@RestController
@RequestMapping("/Lotery/v1/SetPlay")
public class play_controller {
	
	@Autowired
	private PlayRepository playRepository;
	
	@Autowired
	private ComboRepository comboRepository;
	
	@Autowired
	private BillRepository billRepository;
	
	@Autowired
	private MainRepository mainRepository;
	
	
	 @GetMapping("/ShowPlays")
	 public List<Play_Entity> getAllConsultas() {
	   return playRepository.findAll();
	 }
	   
	 @PostMapping("/SetById/{user_id}")
	 public Play_Entity createPlay(@PathVariable(value = "user_id") Long user_id,
		@Valid @RequestBody Combo_Entity playDetails) throws ResourceNotFoundException {
		 {
			 int quantity_selected = playDetails.getQuantity_selected();
			 int[] chosen_numbers = playDetails.getChosen_numbers();
			 String mode = playDetails.getMode();
			 
			 Combo_Entity newCombo = new Combo_Entity(quantity_selected, chosen_numbers, mode);
			 
			 comboRepository.save(newCombo);
			 
			 //Generar Bill
			 ZoneId zonedId = ZoneId.of( "America/Lima" );
			 LocalDate today = LocalDate.now( zonedId );
			 
			 Random random = new Random();
			 int rand = random.nextInt();
			 float total_amount = 0;
			 long repo_id = 1;
			 Main_Entity modelPlay = mainRepository.findById(repo_id)
					 .orElseThrow(() -> new ResourceNotFoundException("Resource not found for this id :: " + user_id));
			 
			 total_amount = playDetails.getQuantity_selected() * modelPlay.getBase_price();
			 String bill_number = user_id.toString() + rand;
			 
			 
			 Bill_Entity newBill = new Bill_Entity(today, total_amount, bill_number);
			 billRepository.save(newBill);
			 
			 //Obtener parametros
			 long conteoBill = billRepository.count();
			 long conteoCombo = comboRepository.count();
			 String win_state = modelPlay.getWin_state();
			 float base_price = modelPlay.getBase_price();
			 int fk_player = user_id.intValue();
			 int fk_combo = (int)comboRepository.getOne(conteoCombo).getCombo_id();
			 int fk_bill = (int)billRepository.getOne(conteoBill).getBill_id();
			 
			 Play_Entity newPlay = new Play_Entity(win_state, base_price, fk_player, fk_combo, fk_bill);
			 
			 return playRepository.save(newPlay);
	 }
		 
  }
	   
}
