package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SalesRepository;

@Service
public class SalesService {
	
	@Autowired
	private SalesRepository salesRepository;
	

	public List<Sale> findSales() {
		return salesRepository.findAll();
	}
}
