package flyweight2;

public class Test {

	/**
	 * Bản chất mẫu flyweight cho ta xử lý dữ liệu lớn 
	 * với số lượng đối tượng nhiều
	 * Ta lấy ra các điểm chung nhất của đối tượng để xử lý tỏng 1 lớp 
	 * để có cảm giác như ta đnag sử dụng nhiều đối tượng cũng một lúc 
	 */
	public static void main(String[] args) {
		String[] names = new String[] { "Huy", "Lap", "Trong" };
		int[] scores = new int[] { 9, 10, 8 };

		Student st = new Student();

		for (int i = 0; i < 3; i++) {
			st.setName(names[i]);
			st.setScores(scores[i]);

			System.out.println("Student " + st.getName() + "has score :"
					+ st.getScores());
		}
	}

}
