package iterator1;

import java.util.Iterator;

public class ConcreateIterator implements Iterator<String> {

	private String[] names;
	private int index = 0;

	public ConcreateIterator(String[] names) {
		// TODO Auto-generated constructor stub
		this.names = names;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (names[index] != null) {
			return true;
		} else
			return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return names[index++];
	}

}
