package builder2;

import builder2.Student.Builder;

public class Test {

	public static void main(String[] args) {

		Builder builder = new Builder("Huy", "Ha Noi");
		builder.setAge(24).setPhoneNumber(123456789).setCapital("Ha Noi");
		Student student = builder.build();

		student.toString();
	}

}
