package standardClass;
import java.io.InputStream;
import java.net.URL;

public class Chapter16 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.impressjapan.jp/");
		InputStream is = url.openStream();
		int i = is.read();
		while(i != -1) {
			char c = (char) i;
			System.out.print(c);
			i = is.read();
		}
	}
}
