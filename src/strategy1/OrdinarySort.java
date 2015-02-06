package strategy1;

public class OrdinarySort implements Arrangement {

	// Phương thức sắp xếp mảng mặc định

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub

		// Biến temp trung gian để lưu trữ giá trị
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				// Sắp xếp dãy theo thứ tự tăng dần
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
