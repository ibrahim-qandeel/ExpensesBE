package com.apartment.backend.repo;

import org.springframework.data.repository.CrudRepository;

import com.apartment.backend.entity.Category;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
