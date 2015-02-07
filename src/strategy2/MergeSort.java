package strategy2;

public class MergeSort implements Arrangement {

	int[] currentArray;

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		currentArray = array;

		// Chia mảng ban đầu thành các mảng con nh�? hơn
		mergeSort(0, array.length - 1);

		return currentArray;
	}

	private void mergeSort(int i, int j) {
		// TODO Auto-generated method stub
		int left = i, right = j;
		int mid = (left + right) / 2;

		// Nếu mảng chỉ còn 1 phần tử thì không chia nữa
		if (right - left < 1)
			return;
		else {

			// Chia mảng thành 2 mảng con nh�? hơn
			//
			mergeSort(i, mid);
			mergeSort(mid + 1, j);

			// Ghép 2 mảng ocn lại theo thứ tự tăng dần
			merge(i, j);
		}
	}

	private void merge(int i, int j) {
		// TODO Auto-generated method stub
		int mid = (i + j) / 2;
		int left = i, right = mid + 1;

		// Biến tạm để lưu trữ
		int temp;

		// Nếu hai mảng ocn còn phần tử thì tiếp tục
		// sắp xếp
		while (left <= mid && right <= j) {

			// So sánh hai giá trị đầu tiên của 2 mảng con
			// Giá trị nào lớn hơn thì sắp xếp vào đầu mảng
			// ban đầu
			if (currentArray[left] > currentArray[right]) {

				// Lưu giá tị vào biến tạm
				temp = currentArray[right];

				// Dịch mảng ban đầu lên 1 đơn vị
				for (int k = right; k > left; k--) {
					currentArray[k] = currentArray[k - 1];
				}
				// Vị trí đầu tiên lưu giá trị từ biến tạm
				// Vị trí đầu tiên đã được sắp xếp
				currentArray[left] = temp;

				// Tăng thêm 1 giá trị rồi tiếp tục so sánh
				right++;
			}
			// Tăng thêm 1 giá trị rồi tiếp tục so sánh
			left++;
		}

	}
}
