package com.kevinjava.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinjava.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
