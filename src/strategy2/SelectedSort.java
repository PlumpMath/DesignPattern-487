package strategy2;

public class SelectedSort implements Arrangement {


	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub

		
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}

		return array;
	}

}
