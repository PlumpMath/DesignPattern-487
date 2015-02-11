package iterator2;

import java.util.Iterator;

public class DivisionIterator implements Iterator<VP> {

	private VP[] vps;
	private int location = 0;

	public DivisionIterator(VP[] vps) {
		// TODO Auto-generated constructor stub
		this.vps = vps;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (location < vps.length && vps[location] != null) {
			return true;
		} else
			return false;
	}

	@Override
	public VP next() {
		// TODO Auto-generated method stub
		return vps[location++];
	}

}
