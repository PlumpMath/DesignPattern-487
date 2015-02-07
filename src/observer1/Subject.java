package observer1;

public interface Subject {

	public void attach(Observer obsever);

	public void detach(Observer obsever);

	public void notifycation();
}
