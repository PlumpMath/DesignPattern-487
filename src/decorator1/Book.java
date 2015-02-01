package decorator1;

public class Book implements LibraryItem {
	
	private String title ;
	private int page ;
	
	
	
	public Book(String title, int page) {
		super();
		this.title = title;
		this.page = page;
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Title : " + title);
		System.out.println("Page number : + page ");
		
	}

}
