package decorator1;

public class VideoDecorator extends LibDecorator {

	public VideoDecorator(LibraryItem libraryItem) {
		super(libraryItem);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Play video ");
	}

}
