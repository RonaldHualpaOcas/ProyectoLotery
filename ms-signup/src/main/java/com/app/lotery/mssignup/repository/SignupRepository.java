package com.app.lotery.mssignup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.lotery.mssignup.model.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup, Long>{

}