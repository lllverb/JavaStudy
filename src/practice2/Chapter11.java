package practice2;
import java.io.OutputStream;
import java.net.Socket;

public class Chapter11 {

	public static void main(String[] args) throws Exception{
//		URL url = new URL("http://dokojava.jp/favicon.ico");
//		InputStream is = url.openStream();
//		OutputStream os = new FileOutputStream("dj.ico");
//		int i = is.read();
//		while(i != -1) {
//			os.write((byte)i);
//			i = is.read();
//		}
//		is.close();
//		os.flush();
//		os.close();
//		11-2///////////////////////////////////////////////////////
		Socket sock = new Socket("smtp.example.com", 60025);
		OutputStream os = sock.getOutputStream();
		os.write("HELO example.com¥r¥n".getBytes());
		os.flush();
		sock.close();
		
//		11-2///////////////////////////////////////////////////////
	}

}
