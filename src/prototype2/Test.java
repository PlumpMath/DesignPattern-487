package prototype2;


public class Test {

	public static void main(String[] args) {

		// test

		Student add = new Student("ABC", 24, "HIK");
		System.out.println(add.getName());
		System.out.println(add.getAge());
		System.out.println(add.getAddress());

		Student add2 = (Student) add.copy();
		System.out.println(add2.getName());
		System.out.println(add2.getAge());
		System.out.println(add2.getAddress());
	}

}
