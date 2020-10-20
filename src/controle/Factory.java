package controle;

public class Factory {

	public ClienteDo getClienteDao() {
		return new ClienteMySqlDao();
	}
}
