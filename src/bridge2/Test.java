package bridge2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends AndroidEventClick {

	public Test(OnclickEvent onclickEvent) {
		super(onclickEvent);
		// TODO Auto-generated constructor stub
		setSize(500, 500);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);

		label = new JLabel("Nothing");
		label.setBounds(222, 222, 100, 30);
		add(label);

		addMouseListener(this);
	}

	private JLabel label;

	/*
	 * public Test() { // TODO Auto-generated constructor stub
	 * 
	 * 
	 * }
	 */

	public static void main(String[] args) {
		new Test(new AndroidOnClickEvent());
	}

}
