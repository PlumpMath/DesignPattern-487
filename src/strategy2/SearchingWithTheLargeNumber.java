package strategy2;

public class SearchingWithTheLargeNumber extends Searching {

	public SearchingWithTheLargeNumber(int[] array) {
		super(array);
		// TODO Auto-generated constructor stub
		setAlgorithm(new MergeSort());
		currentList = arrangement.sort(array);
	}

}
