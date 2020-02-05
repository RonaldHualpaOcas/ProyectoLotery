package com.app.lotery.msRegistroJugada.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "combo")

public class Combo_Entity extends BaseEntity {
	private long combo_id;
	private int quantity_selected;
	private int[] chosen_numbers;
	private String mode;
	
	public Combo_Entity() {
	
	}

	public Combo_Entity(long combo_id, int quantity_selected, int[] chosen_numbers, String mode) {
		super();
		this.combo_id = combo_id;
		this.quantity_selected = quantity_selected;
		this.chosen_numbers = chosen_numbers;
		this.mode = mode;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getCombo_id() {
		return combo_id;
	}

	public void setCombo_id(long combo_id) {
		this.combo_id = combo_id;
	}
	
	
	@Column(name = "quantity_selected", nullable = false)
	public int getQuantity_selected() {
		return quantity_selected;
	}

	public void setQuantity_selected(int quantity_selected) {
		this.quantity_selected = quantity_selected;
	}
		
	@Type(type = "int-array")
	@Column(name = "chosen_numbers", nullable = false, columnDefinition = "integer[]")
	public int[] getChosen_numbers() {
		return chosen_numbers;
	}

	public void setChosen_numbers(int[] chosen_numbers) {
		this.chosen_numbers = chosen_numbers;
	}
	
	@Column(name = "mode", nullable = false)
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}
