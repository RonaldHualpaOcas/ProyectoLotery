package com.app.lotery.msconsultarfactura.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.lotery.msconsultarfactura.exception.ResourceNotFoundException;
import com.app.lotery.msconsultarfactura.model.Bill;
import com.app.lotery.msconsultarfactura.repository.BillRepository;

@RestController
@RequestMapping("/app/lotery/v1")
public class BillController {
	
	 @Autowired
	    private BillRepository billRepository;

	    @GetMapping("/bills")
	    public List<Bill> getAllBills() {
	        return billRepository.findAll();
	    }

	    @GetMapping("/bills/{id}")
	    public ResponseEntity<Bill> getBillById(@PathVariable(value = "id") Long bill_id)
	        throws ResourceNotFoundException {
	        Bill bill = billRepository.findById(bill_id)
	          .orElseThrow(() -> new ResourceNotFoundException("Player not found for this id :" + bill_id));
	        return ResponseEntity.ok().body(bill);
	    }
}
