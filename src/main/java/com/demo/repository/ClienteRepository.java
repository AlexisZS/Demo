package com.demo.repository;

//import java.util.List;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Cliente;


/**
 * Esta clase me permite heredar metodos genericos de JpaRepository, ademas de poder publicar mi porpios emtodos
 * si necesidad de implementarlo, el jpa repository reconoce la expresion utlizada en el nombre del metodo
 * Example:  "findBy" + "Nombre del atributo(CamelCase)"  
 * @author lzambran
 *
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	/**
	 * Busca cliente por dni
	 * @param dni_cli
	 * @return
	 */
	Cliente findByDniCli(String dni_cli);
	
	/**
	 * Busca a todos los cliente con el apellido requerido
	 * @param apePat_cli
	 * @return
	 */
	List<Cliente> findByApePatCli(String apePat_cli);
	
}
