package com.apartment.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apartment.backend.entity.Expenses;
import com.apartment.backend.repo.ExpensesRepo;

@Service
public class ExpensesService {

	@Autowired
	private ExpensesRepo expensesRepo;

	public List<Expenses> getAll() {
		List<Expenses> expenses = new ArrayList<>();
		expensesRepo.findAll().forEach(expenses::add);
		return expenses;
	}

	public Optional<Expenses> getOne(Integer id) {
		return expensesRepo.findById(id);
	}

	public void addNew(Expenses expenses) {
		expensesRepo.save(expenses);
	}
}