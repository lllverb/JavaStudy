package standardClass;
import java.util.Calendar;
import java.util.Date;
public class Main {

	public static void main(String[] args) {
//		Date now = new Date();
//		System.out.println(now);
//		System.out.println(now.getTime());
//		Date past = new Date(1316622225935L);
//		System.out.println(past);
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です。");
		c.set(2010, 8, 22, 1, 23, 45);
		c.set(Calendar.YEAR, 2011);
//		Date past = c .getTime();
	}

}
