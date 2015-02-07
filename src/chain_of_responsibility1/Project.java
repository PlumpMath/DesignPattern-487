package chain_of_responsibility1;

import java.util.ArrayList;

public class Project implements TaskItem {

	private String name;
	private String details;
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

	public void setDetails(String details) {
		this.details = details;
	}

	public ArrayList<TaskItem> getSubtask() {
		return subtask;
	}

	public void setSubtask(ArrayList<TaskItem> subtask) {
		this.subtask = subtask;
	}

	public Project(String name, String details) {
		super();
		this.name = name;
		this.details = details;
	}

	@Override
	public TaskItem getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return details;
	}

	@Override
	public ArrayList<TaskItem> getProjectItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addTask(TaskItem element) {
		if (!subtask.contains(element)) {
			subtask.add(element);
		}
	}

	public void removeProjectItem(TaskItem element) {
		subtask.remove(element);
	}

}
