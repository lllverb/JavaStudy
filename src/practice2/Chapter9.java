package practice2;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;


public class Chapter9 {

	public static void main(String[] args)throws Exception{
//		Files.copy(Paths.get(args[0]), Paths.get(args[1]));
//		9-2//////////////////////////////////////////////////////////
		String inFile = args[0];
		String outFile = args[1];
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		GZIPOutputStream gzos = null;
		try {
			fis = new FileInputStream(inFile);
			fos = new FileOutputStream(outFile);
			bos = new BufferedOutputStream(fos);
			gzos = new GZIPOutputStream(bos);
			int i = fis.read();
			while(i != -1) {
				gzos.write(i);
				i = fis.read();
			}
			gzos.flush();
			gzos.close();
			fis.close();
		} catch(IOException e) {
			System.err.println("ファイル操作に失敗しました");
			try {
				if (fis != null) {
					fis.close();
				}
				if(gzos != null) {
					gzos.close();
				}
			} catch(IOException e2) {}
		}
//		9-2//////////////////////////////////////////////////////////
	}

}
