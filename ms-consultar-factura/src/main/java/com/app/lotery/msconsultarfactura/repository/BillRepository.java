package com.app.lotery.msconsultarfactura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.lotery.msconsultarfactura.model.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long>{

}
