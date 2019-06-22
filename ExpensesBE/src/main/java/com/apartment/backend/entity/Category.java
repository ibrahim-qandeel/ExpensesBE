package com.apartment.backend.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY", schema = "APARTMENT")
public class Category {

	@Id
	private Integer id;
	private String name;
	private String desc;
	
	@OneToMany
	private List<Expenses> expensesList;

	public Category(Integer id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<Expenses> getExpensesList() {
		return expensesList;
	}

	public void setExpensesList(List<Expenses> expensesList) {
		this.expensesList = expensesList;
	}
}
