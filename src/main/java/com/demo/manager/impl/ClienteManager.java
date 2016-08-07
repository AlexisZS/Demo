package com.demo.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.IClienteDao;
import com.demo.dto.ClienteDTO;
import com.demo.manager.IClienteMaganer;

@Service
public class ClienteManager implements IClienteMaganer {

	@Autowired
	private IClienteDao icLienteDao;

	@Override
	public ClienteDTO create(ClienteDTO clienteDTO) {
		return icLienteDao.create(clienteDTO);
	}

	@Override
	public ClienteDTO update(ClienteDTO clienteDTO) {
		return icLienteDao.update(clienteDTO);
	}

	@Override
	public void remove(Integer cod_cli) {

		icLienteDao.remove(cod_cli);

	}

	@Override
	public List<ClienteDTO> getAll() {
		return icLienteDao.getAll();
	}

	@Override
	public ClienteDTO getByDNI(String dni_cli) {
		return icLienteDao.getByDNI(dni_cli);
	}

	@Override
	public List<ClienteDTO> getByApePatn(String apePat_cli) {
		return icLienteDao.getByApePatn(apePat_cli);
	}

}
