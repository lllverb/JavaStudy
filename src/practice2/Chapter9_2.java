package practice2;
import java.io.FileReader;
import java.io.IOException;
public class Chapter9_2 {

	public static void main(String[] args) throws IOException{
//		FileWriter fr = new FileWriter("save1.dat", true);
//		fr.write('A');
//		fr.flush();
//		fr.close();
		FileReader fr = new FileReader("save1.dat");
		System.out.println("全てのデータを読んで表示します");
		int i = fr.read();
		while(i != -1) {
			char c = (char) i;
			System.out.print(c);
			i = fr.read();
		}
		System.out.println("ファイルの末尾に到達しました");
		fr.close();
	}
}
