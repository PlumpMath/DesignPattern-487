package decorator1;

public abstract class LibDecorator implements LibraryItem {
	private LibraryItem libraryItem;

	public LibDecorator(LibraryItem libraryItem) {
		// TODO Auto-generated constructor stub
		this.libraryItem = libraryItem;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		libraryItem.display();
	}

}
