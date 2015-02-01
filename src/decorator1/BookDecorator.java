package decorator1;

public class BookDecorator extends LibDecorator {
	private String borrower;

	public BookDecorator(LibraryItem libraryItem, String borrower) {
		super(libraryItem);
		// TODO Auto-generated constructor stub
		this.borrower = borrower;
	}

	
	
	/* (non-Javadoc)
	 * thêm chức năng hiển thị người mượn
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Borrower: " + borrower);
	}

}
