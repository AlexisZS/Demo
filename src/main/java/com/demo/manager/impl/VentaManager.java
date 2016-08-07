package com.demo.manager.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.IVentaDAO;
import com.demo.dto.VentaDTO;
import com.demo.manager.IVentaManager;


@Service
public class VentaManager  implements IVentaManager{
	
	@Autowired
	private IVentaDAO iVentaDAO;

	@Override
	public VentaDTO create(VentaDTO ventaDTO) {
		return iVentaDAO.create(ventaDTO);
	}

	@Override
	public VentaDTO update(VentaDTO ventaDTO) {
		return iVentaDAO.update(ventaDTO);
	}

	@Override
	public void remove(String num_fact) {
		this. iVentaDAO.remove(num_fact);
		
	}

	@Override
	public List<VentaDTO> getAll() {
		return  iVentaDAO.getAll();
	}
	
	
}
