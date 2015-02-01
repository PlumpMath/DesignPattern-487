package adapter1;

public class Adapterr implements PhoneTarget {

	@Override
	public String getPhoneNumber(String mesenge) {
		// TODO Auto-generated method stub

		// Sử dụng lại phương thức lấy sãy số ra từ chuỗi
		// để sử dụng lại , trả lại số điện thoại

		GetNumberAdaptee obj = new GetNumberAdaptee();

		return obj.getNumber(mesenge);
	}

}
