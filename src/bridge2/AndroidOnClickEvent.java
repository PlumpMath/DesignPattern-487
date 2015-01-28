package bridge2;

import java.awt.event.MouseEvent;

public class AndroidOnClickEvent implements OnclickEvent {

	@Override
	public void addLeftclickevent(MouseEvent event) {
		// TODO Auto-generated method stub
		System.out.println("You click on the left !!!");
	}

	@Override
	public void addRightclickevent(MouseEvent event) {
		// TODO Auto-generated method stub
		System.out.println("You click on the right !!!");
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		// TODO Auto-generated method stub
		if (event.getButton() == MouseEvent.BUTTON1)
			addLeftclickevent(event);
		else
			addRightclickevent(event);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent event) {
		// TODO Auto-generated method stub
		addReleasedclickevent(event);
	}

	@Override
	public void addReleasedclickevent(MouseEvent event) {
		// TODO Auto-generated method stub
		System.out.println(" Hello android !!");
	}

}
