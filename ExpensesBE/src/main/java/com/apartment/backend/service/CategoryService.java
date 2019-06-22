package com.apartment.backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apartment.backend.entity.Category;
import com.apartment.backend.repo.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;

	public List<Category> getAll() {
		List<Category> categories = new ArrayList<>();
		categoryRepo.findAll().forEach(categories::add);
		return categories;
	}

	public Optional<Category> getOne(Integer id) {
		return categoryRepo.findById(id);
	}

	public void addNew(Category category) {
		categoryRepo.save(category);
	}

}
