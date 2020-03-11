package practice2;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
public class Chapter9_5 {

	public static void main(String[] args) throws IOException{
		String msg = "第一土曜日";
		Reader sr = new StringReader(msg);
		char c1 = (char) sr.read();
		char c2 = (char) sr.read();
		System.out.println(c1);
		System.out.println(c2);
	}

}
