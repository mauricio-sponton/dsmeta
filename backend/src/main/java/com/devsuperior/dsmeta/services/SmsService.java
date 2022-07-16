package com.devsuperior.dsmeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SalesRepository;

@Service
public class SmsService {
	
	@Autowired
	private SalesRepository salesRepository;

	public void sendSms(Long id) {
		Sale sale = salesRepository.findById(id).get();
		System.out.println("Vendedor: " + sale.getSellerName());
	}
}
