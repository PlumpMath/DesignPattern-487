package composite1;

import java.util.ArrayList;
import java.util.Iterator;

public class Project implements TaskItem {
	
	// Đây là lớp root , có thể nó là gốc , hoặc nó là cành

	private String name;
	private ArrayList<TaskItem> subtask = new ArrayList<TaskItem>();

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	// Trả lại tổng thời gian của các task thông qua iterator
	// Lấy từng task để get thời gian , nếu là left thì lấy time , 
	// nếu là root thì lại dùng iterator để lây các giá tri từ left

	@Override
	public double getTime() {
		// TODO Auto-generated method stub
		double totalTime = 0;
		Iterator<TaskItem> items = subtask.iterator();
		while (items.hasNext()) {
			TaskItem item = (TaskItem) items.next();
			totalTime += item.getTime();
		}
		return totalTime;
	}

	public ArrayList<TaskItem> getSubTask() {
		return subtask;
	}
	
	// Thêm task Item mới

	public void addTaskItem(TaskItem item) {
		if (!subtask.contains(item)) {
			subtask.add(item);
		}
	}
	
	// Xóa task Item 

	public void removeTaskItem(TaskItem item) {

		subtask.remove(item);

	}

}
