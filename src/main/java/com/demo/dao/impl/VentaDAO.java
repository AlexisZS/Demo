package com.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.demo.dao.IVentaDAO;
import com.demo.dto.VentaDTO;
import com.demo.entity.Venta;
import com.demo.repository.VentaRepository;
import com.googlecode.jmapper.JMapper;

@Component
public class VentaDAO implements IVentaDAO {

	@Resource
	JMapper<VentaDTO, Venta> ventaEntitytoDTOMapper;

	@Resource
	JMapper<Venta, VentaDTO> ventaDTOtoEntityMapper;

	@Resource
	VentaRepository ventaRepository;

	// --------------------------------------------------------------

	@Override
	public VentaDTO create(VentaDTO ventaDTO) {
		return parseVentaEntitytoDTOMapper(this.ventaRepository
				.save(parseVentaDTOtoEntityMapper(ventaDTO)));
	}

	@Override
	public VentaDTO update(VentaDTO ventaDTO) {
		return parseVentaEntitytoDTOMapper(this.ventaRepository
				.save(parseVentaDTOtoEntityMapper(ventaDTO)));
	}

	@Override
	public void remove(String num_fact) {

		for (Venta venta : ventaRepository.findAll() ) {
			if(venta.getNum_fact().equals(num_fact)){
			
				this.ventaRepository.delete(venta.getCod_ven());
				
//				break;
			}
		}

	}

	@Override
	public List<VentaDTO> getAll() {
		List<VentaDTO> list = new ArrayList<VentaDTO>();
		for (Venta venta : this.ventaRepository.findAll()) {
			list.add(parseVentaEntitytoDTOMapper(venta));
		}
		return list;
	}

	// ---------------------------------------------------------------

	private VentaDTO parseVentaEntitytoDTOMapper(Venta venta) {

		if (venta != null) {
			return this.ventaEntitytoDTOMapper.getDestination(venta);
		}

		return null;
	}

	private Venta parseVentaDTOtoEntityMapper(VentaDTO ventaDTO) {
		if (ventaDTO != null) {
			return this.ventaDTOtoEntityMapper.getDestination(ventaDTO);
		}
		return null;
	}

}
