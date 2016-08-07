package com.demo.dao;

import java.util.List;

import com.demo.dto.ClienteDTO;



public interface IClienteDao {

	ClienteDTO create(ClienteDTO clienteDTO);
	ClienteDTO update(ClienteDTO clienteDTO);
	void remove(Integer cod_cli);
	List<ClienteDTO> getAll();
	ClienteDTO getByDNI(String dni_cli );
	List<ClienteDTO> getByApePatn(String apePat_cli);
	
	
}
