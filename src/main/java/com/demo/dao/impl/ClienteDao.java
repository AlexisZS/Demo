package com.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.demo.dao.IClienteDao;
import com.demo.dto.ClienteDTO;
import com.demo.entity.Cliente;
import com.demo.repository.ClienteRepository;
import com.googlecode.jmapper.JMapper;



@Component
public class ClienteDao  implements IClienteDao{
	
	@Resource
	private  JMapper<ClienteDTO, Cliente> clienteEntityToDtoMapper;
	
	@Resource
	private JMapper<Cliente, ClienteDTO> clienteDtoToEntityMapper;
	
	@Resource
	private ClienteRepository clienteRepository;
	

	@Override
	public ClienteDTO create(ClienteDTO clienteDTO) {
		return parseclienteEntityToDtoMapper(this.clienteRepository.save(parseclienteDtoToEntityMapper(clienteDTO)));
	}

	@Override
	public ClienteDTO update(ClienteDTO clienteDTO) {
		return parseclienteEntityToDtoMapper(this.clienteRepository.save(parseclienteDtoToEntityMapper(clienteDTO)));
	}

	@Override
	public void remove(Integer cod_cli) {
		this.clienteRepository.delete(cod_cli);
	}
	
	@Override
	public List<ClienteDTO> getAll() {
		List<ClienteDTO> List = new ArrayList<ClienteDTO>();
		
		for (Cliente cliente : clienteRepository.findAll()) {
			List.add(parseclienteEntityToDtoMapper(cliente));
		}
		return List;
	}
	

	
	
	@Override
	public ClienteDTO getByDNI(String dni_cli) {
		return parseclienteEntityToDtoMapper(this.clienteRepository.findByDniCli(dni_cli));

	}

	
	@Override
	public List<ClienteDTO> getByApePatn(String apePat_cli) {
	
			List<ClienteDTO> ListCliDto = new ArrayList<ClienteDTO>();
			for(Cliente cli : clienteRepository.findByApePatCli(apePat_cli)){
				if(cli.getApePatCli().equals(apePat_cli)){
					ListCliDto.add(parseclienteEntityToDtoMapper(cli));
				}
			}
			return ListCliDto;
			
	}

	//----------------Parseos-----------------------------------------
	
	private ClienteDTO parseclienteEntityToDtoMapper(Cliente cliente) {
		if (cliente != null) {
			return this.clienteEntityToDtoMapper.getDestination(cliente);
		}
		return null;
	}

	private Cliente parseclienteDtoToEntityMapper(ClienteDTO clienteDTO) {
		if (clienteDTO != null) {
			return this.clienteDtoToEntityMapper.getDestination(clienteDTO);
		}
		return null;
	}


	
	
}
