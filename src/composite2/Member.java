package composite2;

public class Member implements Salary {
	private String name;
	private double salary;
	
	// Trả lại số lương của thành viên

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
