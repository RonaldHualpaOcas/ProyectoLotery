package com.app.lotery.msRegistroJugada.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")

public class Player_Entity {
	private long user_id;
	private String name;
	private String last_name;
	private String email;
	private String password;
	private String telephone_number;
	private String FK_role;
	
	public Player_Entity () {
		
	}
	
	public Player_Entity(String email, String password) {
        this.email = email;
        this.password = password;
   }
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	
	
	@Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    

	public void setName(String name) {
        this.name = name;
    }

    @Column(name = "last_name", nullable = false)
	public String getLast_name() {
		return last_name;
	}

    public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

    @Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
	
	@Column(name = "telephone_number", nullable = false)
	public String getTelephone_number() {
		return telephone_number;
	}

	public void setTelephone_number(String telephone_number) {
		this.telephone_number = telephone_number;
	}

	@Column(name = "fk_role", nullable = false)
	public String getFK_role() {
		return FK_role;
	}

	public void setFK_role(String fK_role) {
		FK_role = fK_role;
	}
}
