package strategy2;

public class MergeSort implements Arrangement {

	int[] currentArray;

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		currentArray = array;
		mergeSort(0, array.length - 1);
		return currentArray;
	}
	private void mergeSort(int i, int j) {
		// TODO Auto-generated method stub
		int left = i, right = j;
		int mid = (left + right) / 2;

		if (right - left < 1)
			return;
		else {
			mergeSort(i, mid);
			mergeSort(mid + 1, j);
			merge(i, j);
		}
	}
	private void merge(int i, int j) {
		// TODO Auto-generated method stub
		int mid = (i + j) / 2;
		int left = i, right = mid + 1;
		int temp;
		while (left <= mid && right <= j) {
			if (currentArray[left] > currentArray[right]) {
				temp = currentArray[right];	
				for (int k = right; k > left; k--) {
					currentArray[k] = currentArray[k - 1];
				}	
				currentArray[left] = temp;
				right++;
			}
			left++;
		}

	}
}
