package abstractfactory2;

public abstract class AbstractFactory {
	
	// Đây là lớp factory ảo để tạo ra các lớp factory
	// Các lớp factory kế thừ từ lớp này 
	// sẽ tạo ra các thể hiện thực sự 

	public abstract TextView createTextView();

	public abstract EditText createEditText();

}
