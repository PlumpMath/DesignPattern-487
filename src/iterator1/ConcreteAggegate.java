package iterator1;

public class ConcreteAggegate implements Aggegate {

	private String[] names = new String[100];
	private int index = 0;

	@Override
	public ConcreateIterator iterator() {
		// TODO Auto-generated method stub
		return new ConcreateIterator(names);
	}
	
	public void add(String name){
		this.names[index++] = name ;
	}

}
