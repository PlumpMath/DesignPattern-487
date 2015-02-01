package composite2;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Salary {

	private String nameGroup;
	private ArrayList<Salary> listMember = new ArrayList<Salary>();

	/*
	 * (non-Javadoc) Trả lai số lương của cả nhóm , nhóm có thể chứa các thành
	 * viên hoặc chứa nhiều nhóm khác , gia trị trả về gồm lương của tất cả các
	 * member chứ trong nhóm .
	 */
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		Iterator<Salary> iterator = listMember.iterator();
		double values = 0;
		while (iterator.hasNext()) {
			Salary member = (Salary) iterator.next();
			values += member.getSalary();
		}
		return values;
	}

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public ArrayList<Salary> getListMember() {
		return listMember;
	}

	public void setListMember(ArrayList<Salary> listMember) {
		this.listMember = listMember;
	}

	// Thêm thành viên vào trong nhóm
	public void addSalaryMember(Salary salaryMember) {
		listMember.add(salaryMember);
	}

	// Xóa thành viên ra khỏi nhóm
	public void removeSalaryMember(Salary salaryMember) {
		listMember.remove(salaryMember);
	}

}
