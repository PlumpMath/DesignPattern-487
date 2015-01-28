package abstractfactory2;

public class Test {

	public static void main(String[] args) {
		AbstractFactory factory = new AndroidFactory();
		TextView textView = factory.createTextView();
		System.out.println(textView.getText());
	}

}
