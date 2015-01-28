package bridge2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public interface OnclickEvent extends MouseListener{
	
	public void addLeftclickevent(MouseEvent event);
	public void addRightclickevent(MouseEvent event);
	public void addReleasedclickevent(MouseEvent event);

}
