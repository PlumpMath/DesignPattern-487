package factory;

public abstract class ConnectionFactory {
	
	public ConnectionFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract Connection createConnection(String type);

}
