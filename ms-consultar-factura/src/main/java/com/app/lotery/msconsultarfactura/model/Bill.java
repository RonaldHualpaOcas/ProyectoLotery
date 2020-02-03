package com.app.lotery.msconsultarfactura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "bill")
public class Bill {

	   private long bill_id;
	    private Date date;
	    private double totalAmount;
	    private String billNumber;
	 
	    public Bill() {
	  
	    }
	    
	    public Bill(Date date,double totalAmount,String billNumber) {
	         this.date = date;
	         this.totalAmount = totalAmount;
	         this.billNumber = billNumber;
	    }
	 
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	        public long getBill_id() {
	        return bill_id;
	    }
	    public void setBill_id(long bill_id) {
	        this.bill_id = bill_id;
	    }

	    @Column(name = "date_bill", nullable = false)
		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

	    @Column(name = "total_amount", nullable = false)
		public double getTotalAmount() {
			return totalAmount;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}

	    @Column(name = "bill_number", nullable = false)
		public String getBillNumber() {
			return billNumber;
		}

		public void setBillNumber(String billNumber) {
			this.billNumber = billNumber;
		}
	 
	    
	    
}
