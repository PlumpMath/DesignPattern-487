package command2;

public class AddCommand implements CommandInterface {

	private Item item;
	private Category category;

	public AddCommand(Item item, Category category) {
		super();
		this.item = item;
		this.category = category;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		item.add(category);
		category.add(item);
	}

}
