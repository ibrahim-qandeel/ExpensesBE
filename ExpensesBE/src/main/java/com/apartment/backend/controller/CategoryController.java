package com.apartment.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apartment.backend.entity.Category;
import com.apartment.backend.service.CategoryService;

@RestController
public class CategoryController {
	

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public List<Category> getAllCategories() {
		return categoryService.getAll();
	}
	
	@RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
	public Category getCategoryBy(@PathVariable Integer id) {
		Optional<Category> optional = categoryService.getOne(id);
		return optional.get();
	}

	@RequestMapping(value = "/category/add", method = RequestMethod.POST)
	public void addExpense(@RequestBody Category category) {
		categoryService.addNew(category);
	}

}
