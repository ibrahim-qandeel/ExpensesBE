package com.apartment.backend.repo;

import org.springframework.data.repository.CrudRepository;

import com.apartment.backend.entity.Expenses;

public interface ExpensesRepo extends CrudRepository<Expenses, Integer>{

}
