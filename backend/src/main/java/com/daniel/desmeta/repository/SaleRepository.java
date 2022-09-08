package com.daniel.desmeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.desmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
