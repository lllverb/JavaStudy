package standardClass;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Chapter14_1 {

	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int year= c.get(Calendar.YEAR);
		int newYear = year += 100;
		c.set(Calendar.YEAR, newYear);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(f.format(future));
	}

}
