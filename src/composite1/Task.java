package composite1;

public class Task implements TaskItem {
	
	// Đây là lớp left

	private String name;
	private double time;

	public Task() {
		// TODO Auto-generated constructor stub
	}

	public Task(String name, double time) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.time = time;
	}

	@Override
	public double getTime() {
		// TODO Auto-generated method stub
		return time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTime(double time) {
		this.time = time;
	}

}
