package bridge2;

import java.awt.event.MouseEvent;

public abstract class AndroidEventClick extends ContainerEvent {

	public AndroidEventClick(OnclickEvent onclickEvent) {
		super(onclickEvent);
		// TODO Auto-generated constructor stub
	}

	public void onLongClickEvent() {
		String mess = "Long click !!!";
		System.out.println(mess);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		switch (e.getButton()) {
		case MouseEvent.BUTTON1: {
			addLeftclickevent(e);
			addReleasedclickevent(e);
		}

			break;
		case MouseEvent.BUTTON2:

			break;
		case MouseEvent.BUTTON3: {
			addRightclickevent(e);
			addReleasedclickevent(e);
		}

			break;

		default: {
			onLongClickEvent();
			addReleasedclickevent(e);
		}
			break;
		}
	}

	@Override
	public void addRightclickevent(MouseEvent event) {
		// TODO Auto-generated method stub
		super.addRightclickevent(event);
	}

	@Override
	public void addReleasedclickevent(MouseEvent event) {
		// TODO Auto-generated method stub
		super.addReleasedclickevent(event);
	}

	@Override
	public void addLeftclickevent(MouseEvent event) {
		// TODO Auto-generated method stub
		super.addLeftclickevent(event);
	}

}
