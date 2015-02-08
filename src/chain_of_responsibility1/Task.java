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
		if (getParent() == null) {
			return details;
		} else {
			return parent.getDetails() + " End of String " + "\t";
		}
	}

	@Override
	public ArrayList<TaskItem> getProjectItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<TaskItem> getSubtask() {
		return subtask;
	}

	public void setSubtask(ArrayList<TaskItem> subtask) {
		this.subtask = subtask;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setParent(TaskItem parent) {
		this.parent = parent;
	}

	public void addSubTask(TaskItem taskItem) {
		if (!subtask.contains(taskItem)) {
			subtask.add(taskItem);
		}
	}

	public void removeSubTask(TaskItem taskItem) {

		subtask.remove(taskItem);

	}

}
