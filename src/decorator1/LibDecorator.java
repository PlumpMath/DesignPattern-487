package decorator1;

/**
 * Lớp này thực thi phương thức mặc định của LibraryItem Lớp này để cho các lớp
 * con kế thừa và thêm vào các chức năng mới mà không cần phải thay đổi mã code
 * các lớp cũ
 */
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
