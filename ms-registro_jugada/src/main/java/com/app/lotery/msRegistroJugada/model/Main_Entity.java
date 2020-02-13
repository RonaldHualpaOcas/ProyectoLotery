package com.app.lotery.msRegistroJugada.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Main_Entity {
	private long balls_id;
	private String default_mode;
	private int [] generated_balls;
	private float base_price;
	private String win_state;
	
	public Main_Entity() {
		super();
	}

	public Main_Entity(String default_mode, int[] generated_balls, float base_price) {
		super();
		this.default_mode = default_mode;
		this.generated_balls = generated_balls;
		this.base_price = base_price;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getBalls_id() {
		return balls_id;
	}

	public void setBalls_id(long balls_id) {
		this.balls_id = balls_id;
	}

	@Column(name = "default_mode", nullable = false)
	public String getDefault_mode() {
		return default_mode;
	}

	public void setDefault_mode(String default_mode) {
		this.default_mode = default_mode;
	}

	@Column(name = "generated_balls", nullable = false)
	public int[] getGenerated_balls() {
		return generated_balls;
	}

	public void setGenerated_balls(int[] generated_balls) {
		this.generated_balls = generated_balls;
	}

	@Column(name = "base_price", nullable = false)
	public float getBase_price() {
		return base_price;
	}

	public void setBase_price(float base_price) {
		this.base_price = base_price;
	}

	@Column(name = "win_state", nullable = false)
	public String getWin_state() {
		return win_state;
	}

	public void setWin_state(String win_state) {
		this.win_state = win_state;
	}
	
	
	
	
}
