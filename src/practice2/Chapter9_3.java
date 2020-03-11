package practice2;
import java.io.FileWriter;
import java.io.IOException;

public class Chapter9_3 {

	public static void main(String[] args) {
//		FileOutputStream fos  = new FileOutputStream("save.dat", true);
//		fos.write(65);
//		fos.flush();
//		fos.close();
		FileWriter fw = null;
		try {
//			fw = new FileWriter("save2.dat", true);
			fw.write('B');
			fw.flush();
		} catch(IOException e) {
			System.out.println("ファイル書き込みエラーです");
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch(IOException e2) {

				}
			}
		}
	}

}
