package chain_of_responsibility1;

import java.util.ArrayList;

public interface TaskItem {

	public TaskItem getParent();

	public String getDetails();

	public ArrayList<TaskItem> getProjectItems();

}
