package factory1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLogger implements Logger {

	// phương thức sẽ ghi ra file log.txt
	// chuỗi msg

	@Override
	public void log(String msg) {
		// TODO Auto-generated method stub
		FileUtil futil = new FileUtil();
		futil.writeToFile("log.txt", msg);
	}

	// inner class

	public class FileUtil {

		File file = null;

		public FileUtil() {
			// TODO Auto-generated constructor stub
		}

		public void writeToFile(String fileName, String messenge) {

			// if (!file.exists())
			// Khởi tạo file mới
			file = new File(fileName);

			try {
				DataOutputStream out = new DataOutputStream(
						new FileOutputStream(file));
				// Ghi chuỗi messenge ra file
				out.writeUTF(messenge);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
