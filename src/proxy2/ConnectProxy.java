package proxy2;

public class ConnectProxy implements ConnectionDB{
	
	private String user ;
	
	/**
	 * Bản chât mẫu proxy là tạo ra 1 lớp để client tương tác thay cho đối 
	 * tượng thực sự . 
	 */
	public ConnectProxy(String user) {
		// TODO Auto-generated constructor stub
		this.user = user;
	}
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
		OracleConnect oracle = new OracleConnect();
		if(user.equalsIgnoreCase("Huy")){
			oracle.connect();
		}else{
			System.out.println("You can't connect Database");
		}
		
		
	}

}
