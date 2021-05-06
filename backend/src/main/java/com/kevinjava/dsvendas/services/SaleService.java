package com.kevinjava.dsvendas.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kevinjava.dsvendas.dto.SaleDTO;
import com.kevinjava.dsvendas.dto.SaleSucessDTO;
import com.kevinjava.dsvendas.dto.SaleSumDTO;
import com.kevinjava.dsvendas.entities.Sale;
import com.kevinjava.dsvendas.repositories.SaleRepository;
import com.kevinjava.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result =  repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public 	List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public 	List<SaleSucessDTO> sucessGroupedBySeller() {
		return repository.sucessGroupedBySeller();
	}

	
	
	
}
