package dao;

import java.util.List;

import model.Cliente;

public interface ClienteDao {

	public Integer incluirCliente(Cliente cliente);
	List<Cliente> clientes = listarCliente();
}
