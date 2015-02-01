package decorator2;

public class MobilePhone {
	
	// Lớp mobile với các chức năng cơ bản
	// Chỉ thuần gọi điện
	
	private String name ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void call(){
		System.out.println("Calling ....");
	}	

}
