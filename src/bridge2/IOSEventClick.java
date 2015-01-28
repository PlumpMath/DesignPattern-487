package bridge2;

import java.awt.event.MouseEvent;

public class IOSEventClick extends ContainerEvent {
	
	public IOSEventClick(OnclickEvent onclickEvent) {
		super(onclickEvent);
		// TODO Auto-generated constructor stub
	}

	public String onShortClickEvent(MouseEvent e) {
		String mess = "Short click !!!";
		System.out.println(mess);
		return mess;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		onShortClickEvent(e);
	}

}
