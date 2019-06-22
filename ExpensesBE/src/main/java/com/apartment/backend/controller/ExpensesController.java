package com.apartment.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apartment.backend.entity.Expenses;
import com.apartment.backend.service.ExpensesService;

@RestController
public class ExpensesController {

	@Autowired(required = true)
	private ExpensesService expensesService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello Expenses";
	}

	@RequestMapping(value = "/expenses", method = RequestMethod.GET)
	public List<Expenses> getAllExpenses() {
		List<Expenses> expensesList = expensesService.getAll();
		return expensesList;
	}

	@RequestMapping(value = "/expenses/{id}", method = RequestMethod.GET)
	public Expenses getExpensesBy(@PathVariable Integer id) {
		Optional<Expenses> optional = expensesService.getOne(id);
		return optional.get();
	}

	@RequestMapping(value = "/expenses/add", method = RequestMethod.POST)
	public void addExpense(@RequestBody Expenses expense) {
		expensesService.addNew(expense);
	}
}
