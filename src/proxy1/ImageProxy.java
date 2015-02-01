package proxy1;

public class ImageProxy implements Image {

	private Image image;

	@Override
	public void process() {
		// TODO Auto-generated method stub

		if (image == null)
			image = new JPGImage();
		image.process();

	}

}
