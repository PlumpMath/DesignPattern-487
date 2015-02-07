package strategy2;

public class Test {

	public static void main(String[] args) {

		int[] testArray = new int[] { 9, 4, 78, 8, 3, 3, 7, 56, 4, 234, 346,
				387 };

		Arrangement testSort = new MergeSort();

		int[] test = testSort.sort(testArray);

		for (int i = 0; i < test.length; i++) {
			System.out.print("\t " + test[i]);
		}

	}

}
