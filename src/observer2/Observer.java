package observer2;

public interface Observer {
	
	// Cài đặt giao diện chung cho phương thức update 
	// Khi thông tin được update thì đối tượng sẽ gửi thông báo
	// đên các lớp đăng kí 

	public void update(String operation, String record);

}
