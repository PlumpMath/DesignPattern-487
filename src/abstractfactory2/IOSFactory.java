package abstractfactory2;

public class IOSFactory extends AbstractFactory {
	
		// Lớp này là một lớp Factory để khởi tạo đối tượng 
		// cụ thể của tạo ra các giao diện cụ thể cho IOS
	

	@Override
	public TextView createTextView() {
		// TODO Auto-generated method stub
		return new IOSTextView();
	}

	@Override
	public EditText createEditText() {
		// TODO Auto-generated method stub
		return new IOSEditText();
	}
}
