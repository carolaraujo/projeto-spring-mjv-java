package dao;

public class ClienteOracleDao implements ClienteDao {

	@Override
	public Integer IncluirCliente(Cliente cliente) {
		return cliente.getId();
	}

	@Override
	public List<Cliente> listarCliente() {
	return new ArrayList<>();
}
}
