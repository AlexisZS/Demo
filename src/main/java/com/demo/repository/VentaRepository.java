package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Cliente;
import com.demo.entity.Venta;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
	
	
	

}
