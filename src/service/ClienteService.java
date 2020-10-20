package service;

import java.util.List;

import dao.ClienteOracleDao;
import model.Cliente;

public class ClienteService {
	
	private ClienteDao dao;
	
	public ClienteService(ClienteDao dao) {
		this.dao = new Factory;
	}

	public Integer incluirCliente(Cliente cliente) {
		
		List<Cliente> clientes = listarCliente();
		
		for(Cliente c : clientes) {
			if(c.getNome().equals(cliente.getNome())) {
				return null;
			}
		}
		
		return dao.IncluirCliente(cliente);
	}
	
	public List<Cliente> listarCliente() {
		ClienteOracleDao dao = new ClienteOracleDao();

}
	return dao.listarCliente(cliente);
}
