package com.app.lotery.msRegistroJugada.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill_Entity {
	private long bill_id;
	private Date date;
	private float total_amount;
	private String bill_number;
	
	public Bill_Entity() {
		super();
	}

	public Bill_Entity(Date date, float total_amount, String bill_number) {
		super();
		this.date = date;
		this.total_amount = total_amount;
		this.bill_number = bill_number;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getBill_id() {
		return bill_id;
	}

	public void setBill_id(long bill_id) {
		this.bill_id = bill_id;
	}

	@Column(name = "date", nullable = false)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "total_amount", nullable = false)
	public float getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(float total_amount) {
		this.total_amount = total_amount;
	}

	@Column(name = "bill_number", nullable = false)
	public String getBill_number() {
		return bill_number;
	}

	public void setBill_number(String bill_number) {
		this.bill_number = bill_number;
	}
	
	
}
