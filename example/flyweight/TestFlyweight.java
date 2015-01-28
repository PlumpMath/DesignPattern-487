package flyweight;

public class TestFlyweight implements Runnable {

	Thread thread;

	public TestFlyweight() {
		// TODO Auto-generated constructor stub
		String[] names = { "Ralp", "Alice", "Sam" };
		int[] ids = { 1002, 1002, 1003 };
		int[] scores = { 45, 55, 65 };

		double total = 0;
		for (int loopIndex = 0; loopIndex < scores.length; loopIndex++) {
			total += scores[loopIndex];
		}

		double avarageScore = total / scores.length;

		Student student = Student.getInstance();

		student.setAverageScore(avarageScore);
		student.setName("Ralp");
		student.setId(1002);
		student.setScore(45);

		thread = new Thread(this, "seconds");
		thread.start();

		System.out.println(" Name " + student.getName());
		System.out.println(" Standing: " + Math.round(student.getStanding()));
		System.out.println("");

	}

	public static void main(String[] args) {

		TestFlyweight t = new TestFlyweight();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Student student = Student.getInstance();
		System.out.println(" Name " + student.getName());
		System.out.println(" Standing: " + Math.round(student.getStanding()));
		System.out.println("");
	}

}
