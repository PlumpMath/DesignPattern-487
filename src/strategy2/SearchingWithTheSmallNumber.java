package strategy2;

public class SearchingWithTheSmallNumber extends Searching {

	public SearchingWithTheSmallNumber(int[] array) {
		super(array);
		// TODO Auto-generated constructor stub
		setAlgorithm(new SelectedSort());
		currentList = arrangement.sort(array);
	}

}
