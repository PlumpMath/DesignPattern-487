package command2;

import java.util.HashMap;

public class Category {

	private HashMap<String, Item> items;
	private String desc;

	public Category(String s) {
		desc = s;
		items = new HashMap<String, Item>();
	}

	public String getDesc() {
		return desc;
	}

	public void add(Item i) {
		items.put(i.getDesc(), i);
		System.out.println("Item '" + i.getDesc() + "' has been added to the '"
				+ getDesc() + "' Category ");
	}

}
