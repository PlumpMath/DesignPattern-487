package iterator2;

public class Division {

	private VP[] vps = new VP[100];
	private int number = 0;
	private String name;

	public Division(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void add(String n){
		VP vp = new VP(name, n);
		vps[number++] = vp;
	}
	
	public DivisionIterator iterator(){
		return new DivisionIterator(vps);
	}

}
