package strategy2;

public abstract class Searching {

	int[] currentList;
	protected Arrangement arrangement;
	int number;

	public Searching(int[] array) {
		// TODO Auto-generated constructor stub
		setAlgorithm(new QuickSort());
		currentList = arrangement.sort(array);
	}

	public void setAlgorithm(Arrangement arrangement) {
		this.arrangement = arrangement;
	}

	public boolean search(int number) {
		this.number = number;
		return binarySearch(0, currentList.length - 1);
	}

	private boolean binarySearch(int i, int j) {
		// TODO Auto-generated method stub
		int h = (i + j) / 2;
		if (currentList[h] == number)
			return true;
		else if (currentList[h] > number && h > i) {
			return binarySearch(i, h);
		} else if (currentList[h] < number && h < j) {
			return binarySearch(h + 1, j);
		} else
			return false;
	}
}
