package adapter2;

public class Photoshop implements DrawImage {

	@Override
	public void createImage() {
		// TODO Auto-generated method stub
		
		// Phương thức này sẽ sử dụng phương thức của lớp Paint
		// để khởi tạo tiêu đề của một bức ảnh 
		
		Drawable drawImage = new Paint();
		String imageTitle = drawImage.draw("");
		
		// Vẽ nốt phần còn lại của bức ảnh
		
		System.out.println("Complete image ...");
	}
}
