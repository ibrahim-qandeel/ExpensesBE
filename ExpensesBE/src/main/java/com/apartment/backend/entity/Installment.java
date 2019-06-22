package com.apartment.backend.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "INSTALLMENT", schema = "APARTMENT")
public class Installment {

	@Id
	private Integer id;
	private Double installment;
	private Date date;
	
	public Installment() {
	}
	
	
	public Installment(Integer id, Double installment, Date date) {
		super();
		this.id = id;
		this.installment = installment;
		this.date = date;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getInstallment() {
		return installment;
	}
	public void setInstallment(Double installment) {
		this.installment = installment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
