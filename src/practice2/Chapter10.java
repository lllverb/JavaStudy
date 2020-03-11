package practice2;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Chapter10 {
	public static void main (String[] args) throws Exception{
		Reader fr = new FileReader("");
		Properties p = new Properties();
		p.load(fr);
		String s1 = p.getProperty("aichi.capital");
		String s2 = p.getProperty("aichi.food");
		fr.close();

	}

}
