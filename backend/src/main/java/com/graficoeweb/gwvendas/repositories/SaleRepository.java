package com.graficoeweb.gwvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graficoeweb.gwvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
