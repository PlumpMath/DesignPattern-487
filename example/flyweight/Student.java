package flyweight;

public class Student {
	String name;
	int id;
	int score;
	double averageScore;

	private Student() {
		// TODO Auto-generated constructor stub

	}

	private static Student singleStudent = new Student();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScorre() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}

	public double getStanding() {
		return (((double) score) / averageScore - 1.0) * 100.0;
	}

	public static Student getInstance() {
		return singleStudent;
	}

}
