package com.demo.manager;

import java.util.List;

import com.demo.dto.VentaDTO;

public interface IVentaManager {
	
	VentaDTO create(VentaDTO ventaDTO);
	VentaDTO update(VentaDTO ventaDTO);
	void remove(String num_fact);
	List<VentaDTO> getAll();
	
}
