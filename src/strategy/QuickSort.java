package strategy;

public class QuickSort implements Arrangement {

	int[] currentArray;

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		currentArray = array;
		quicksort(0, currentArray.length - 1);
		
		// Trả lại mảng sau khi đã sắp xếp
		return currentArray;
	}

	private void quicksort(int i, int j) {

		int left = i, right = j;
		
		// Lấy giá trị giữa mảng để so sánh
		int pivot = currentArray[(i + j) / 2];
		int temp;
		
		// Nếu left < right thì vẫn tiếp túc so sánh
		while (left <= right) {
			
			// Nếu giá trị left vẫn nh�? hơn giá tị pivot
			// Tăng left
			while (currentArray[left] < pivot)
				left++;
			
			// Nếu giá trị right vẫn lớn hơn giá tị pivot
			// Giảm right
			while (pivot < currentArray[right])
				right--;
			
			// Thay đổi vị trí 2 giá trị v�? vị trí đúng cua nó 
			if (left <= right) {
				temp = currentArray[left];
				currentArray[left] = currentArray[right];
				currentArray[right] = temp;
				left++;
				right--;
			}
		}
		
		// Nếu đi�?u kiện bất biễn vẫn th�?a mãn
		// Chia thành 2 mảng nh�? để tiếp tục
		if (i < right)
			quicksort(left, j);
		if (left < j)
			quicksort(i, right);
	}
}
