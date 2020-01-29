package com.app.lotery.mssignup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "player")

public class Signup {
	private long player_id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String telephone_number;


public Signup() {
	  
}

public Signup(String firstName, String lastName, String email,String password,String telephone_number) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.telephone_number = telephone_number;
}


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getPlayer_id() {
    return player_id;
}
public void setPlayer_id(long player_id) {
    this.player_id = player_id;
}

@Column(name = "first_name", nullable = false)
public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

@Column(name = "last_name", nullable = false)
public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

@Column(name = "email_address", nullable = false)
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



@Override
public String toString() {
    return "Player [id=" + player_id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + email
   + "]";
}



}

