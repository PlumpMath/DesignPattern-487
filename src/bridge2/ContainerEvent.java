package bridge2;

import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public abstract class ContainerEvent extends JFrame implements OnclickEvent {

	OnclickEvent onclickEvent ;
	
	public ContainerEvent(OnclickEvent onclickEvent) {
		// TODO Auto-generated constructor stub
		this.onclickEvent = onclickEvent;
	}

	public abstract void mouseClicked(MouseEvent e);

	{
		// TODO Auto-generated method stub
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
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addLeftclickevent(MouseEvent event) {
		// TODO Auto-generated method stub
		onclickEvent.addLeftclickevent(event);
	}

	@Override
	public void addRightclickevent(MouseEvent event) {
		// TODO Auto-generated method stub
		onclickEvent.addRightclickevent(event);
	}

	@Override
	public void addReleasedclickevent(MouseEvent event) {
		// TODO Auto-generated method stub
		onclickEvent.addReleasedclickevent(event);
	}
}
