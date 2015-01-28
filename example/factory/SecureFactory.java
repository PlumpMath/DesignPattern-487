package factory;

public class SecureFactory extends ConnectionFactory {

	@Override
	public Connection createConnection(String type) {
		// TODO Auto-generated method stub
		
		if(type.equals("Oracle")){
			return new SecureOracleConnection();
		}else if(type.equals("SQL serner")){
			return new SecureSQLServerConnection();
		}else {
			return new SecureMySqlConnection();
		}
	}

}
