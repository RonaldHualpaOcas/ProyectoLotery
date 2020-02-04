package com.app.lotery.msConsultaJugada.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "play")
public class Play_Entity {
	private long play_id;
	private String win_state;
	private float base_price;
	private int fk_player;
	private int fk_combo;
	private int fk_bill;
	
	public Play_Entity() {

	}

	public Play_Entity(int fk_player, int fk_combo) {
		super();
		this.fk_player = fk_player;
		this.fk_combo = fk_combo;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getPlay_id() {
		return play_id;
	}

	public void setPlay_id(long play_id) {
		this.play_id = play_id;
	}
	
	@Column(name = "win_state", nullable = false)
	public String getWin_state() {
		return win_state;
	}

	public void setWin_state(String win_state) {
		this.win_state = win_state;
	}
	
	@Column(name = "base_price", nullable = false)
	public float getBase_price() {
		return base_price;
	}

	public void setBase_price(float base_price) {
		this.base_price = base_price;
	}

	@Column(name = "fk_player", nullable = false)
	public int getFk_player() {
		return fk_player;
	}

	public void setFk_player(int fk_player) {
		this.fk_player = fk_player;
	}

	@Column(name = "fk_combo", nullable = false)
	public int getFk_combo() {
		return fk_combo;
	}

	public void setFk_combo(int fk_combo) {
		this.fk_combo = fk_combo;
	}

	@Column(name = "fk_bill", nullable = false)
	public int getFk_bill() {
		return fk_bill;
	}

	public void setFk_bill(int fk_bill) {
		this.fk_bill = fk_bill;
	}
	
	
	
}
