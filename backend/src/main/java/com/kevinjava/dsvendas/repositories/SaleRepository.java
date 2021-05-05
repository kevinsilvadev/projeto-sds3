package com.kevinjava.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinjava.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
