package com.app.lotery.mslogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.lotery.mslogin.model.LoginData;

@Repository
public interface DataRepository extends JpaRepository <LoginData, Long>{

}
