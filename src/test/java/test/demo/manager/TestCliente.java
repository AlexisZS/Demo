package test.demo.manager;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;






//import com.demo.dao.IClienteDao;
import com.demo.dto.ClienteDTO;
import com.demo.manager.IClienteMaganer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestCliente {
	
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml"); 

	private static final Logger LOGGER	= LoggerFactory.getLogger(TestCliente .class);
	private static final Gson	GSON	= new GsonBuilder().serializeNulls().setPrettyPrinting().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();
	
	private IClienteMaganer manager;
	
	@Before
	public void setUp() {
		manager = (IClienteMaganer) context.getBean("clienteManager");
	}
	
	//------------------------------------Listar  CLientes-------------------------------------------------
	@Test
	public void testClienteList(){
		List<ClienteDTO> list1 = manager.getAll();
		LOGGER.info("Lista de clietes:  /n" + GSON.toJson(list1));
	}
	
	//------------------------------------Agregar CLiente-------------------------------------------------
	@Ignore
	@Test
	public void testClientCreate(){
		
		ClienteDTO clienteDTO = new ClienteDTO();
	
		clienteDTO.setCodCli(3);
		clienteDTO.setDniCli("9876543");
		clienteDTO.setNomCli("Luis");
		clienteDTO.setApePatCli("Palacios");
		clienteDTO.setApeMatCli("Zambrano");
		clienteDTO.setEdadCli(49);
		clienteDTO.setDireccCli("San Isidro");
		manager.create(clienteDTO);
		
		LOGGER.info("Cliente Agregador " + GSON.toJson(clienteDTO) );
	}
	
	//-----------------------------------------Actualizar Cliente ----------------------------------------------	
	
//	@Ignore
	@Test
	public void testClientUpdate(){
	
	ClienteDTO clienteDTO = new ClienteDTO();
	clienteDTO.setCodCli(3);                  // es nesario tener la llave primari 
	clienteDTO.setDniCli("9876543");			// por el momemento es necesario tener todo los campos
	clienteDTO.setNomCli("Luis");
	clienteDTO.setApePatCli("PalaciosZZ");
	clienteDTO.setApeMatCli("Zambrano");
	clienteDTO.setEdadCli(50);
	clienteDTO.setDireccCli("San Isidro");
	manager.update(clienteDTO);
	
	LOGGER.info("Cliente Actualizado " + GSON.toJson(clienteDTO) + "desde interface");
	
	}
	//-----------------------------------------Eliminar Cliente ----------------------------------------------	
	
	@Ignore
	@Test
	public void testClientDelete(){
		
	ClienteDTO clienteDTO = new ClienteDTO();
	clienteDTO.setCodCli(3);
	manager.remove(clienteDTO.getCodCli());
	LOGGER.info("Cliente Eliminado  codigo : "+ GSON.toJson(clienteDTO.getCodCli()));
	
	}

	//--------------------------BUSCAR POR DNI--------------------------------------------
	
//	@Ignore
	@Test
	public void testClientFindDNI(){
	
	ClienteDTO client = manager.getByDNI("12345678");
	LOGGER.info("Cliente encontrado : " + GSON.toJson(client) + "desde interface");
	
	}
	//-------------------------BUSCAR POR APELLIDO--------------------------------------------
	
//	@Ignore
	@Test
	public void testClientFindApellido(){

	List<ClienteDTO> lista = manager.getByApePatn("zam");
	LOGGER.info("Cliente encontrado : " + GSON.toJson(lista) + "desde interface");
	}
	
	//----------------------------------------------------------------------------------------
	


}
