package decorator1;

public class Video implements LibraryItem{
	

	private String title ;
	private int minutes ;
	
	
	
	public Video(String title, int minutes) {
		super();
		this.title = title;
		this.minutes = minutes;
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Title : " + title);
		System.out.println("Time : + minutes ");
		
	}

}
