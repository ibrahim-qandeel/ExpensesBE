package com.apartment.backend.repo;

import org.springframework.data.repository.CrudRepository;

import com.apartment.backend.entity.Installment;

public interface InstallmentRepo extends CrudRepository<Installment, Integer>{

}
