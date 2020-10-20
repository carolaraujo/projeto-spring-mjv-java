package controle;

import dao.ClienteOracleDao;
import model.Cliente;
import service.ClienteService;

public class ClienteControle {

	public Integer incluirCliente(Cliente cliente) {
		
		ClienteService service = new ClienteService(new ClienteMySqlDao());
		
		return null;
	}
}
