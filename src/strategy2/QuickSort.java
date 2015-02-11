package strategy2;

public class QuickSort implements Arrangement {

	int[] currentArray;

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		currentArray = array;
		quicksort(0, currentArray.length - 1);
		return currentArray;
	}

	private void quicksort(int i, int j) {

		int left = i, right = j;
		
		int pivot = currentArray[(i + j) / 2];
		int temp;
		while (left <= right) {
			while (currentArray[left] < pivot)
				left++;
			while (pivot < currentArray[right])
				right--;
			if (left <= right) {
				temp = currentArray[left];
				currentArray[left] = currentArray[right];
				currentArray[right] = temp;
				left++;
				right--;
			}
		}
		if (i < right)
			quicksort(left, j);
		if (left < j)
			quicksort(i, right);
	}
}
