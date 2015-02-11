package command2;

public class DeleteCommand implements CommandInterface {

	private Item item;
	private Category category;

	public DeleteCommand(Item item, Category category) {
		super();
		this.item = item;
		this.category = category;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		item.delete(category);
		// category.add(item);
	}

}
