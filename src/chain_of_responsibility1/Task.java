package chain_of_responsibility1;

import java.util.ArrayList;

public class Task implements TaskItem {

	private String name;
	private String details;
	private ArrayList<TaskItem> subtask = new ArrayList<TaskItem>();
	private TaskItem parent;

	public Task(TaskItem newParent) {
		this("", "", newParent);
		this.parent = newParent;
	}

	public Task(String name, String details, TaskItem parent) {
		super();
		this.name = name;
		this.details = details;
		this.parent = parent;
	}

	@Override
	public TaskItem getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TaskItem> getProjectItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
