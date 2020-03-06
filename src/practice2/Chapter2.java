package practice2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Chapter2 {

	public static void main(String[] args) {
		//2-2/////////////////////////////////////////////////
//		Instant i1 = Instant.now();
//		Instant i2 = Instant.ofEpochMilli(31920291332L);
//		long l = i2.toEpochMilli();
//
//		ZonedDateTime z1 = ZonedDateTime.now();
//		ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
//		Instant i3 = z2.toInstant();
//		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
//
//		System.out.println("東京" + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());
//		if (z2.isEqual(z3)) {
//			System.out.println("これらは同じ瞬間を指しています。");
//		}
		//2-2/////////////////////////////////////////////////
		//2-3/////////////////////////////////////////////////
//		LocalDateTime l1 = LocalDateTime.now();
//		LocalDateTime l2 = LocalDateTime.of(2014, 1, 1, 9, 5, 0, 0);
//		System.out.println(l1);
		//2-3/////////////////////////////////////////////////
		//2-5/////////////////////////////////////////////////
//		LocalDate d1 = LocalDate.of(2012, 1, 1);
//		LocalDate d2 = LocalDate.of(2012, 1, 4);
//		System.out.println(d1);
//		System.out.println(d2);
//		Period p1 = Period.ofDays(3);
//		Period p2 = Period.between(d1, d2);
//		System.out.println(p1);
//		System.out.println(p2);
//		LocalDate d3 = d2.plus(p2);
//		System.out.println(d3);
		//2-5/////////////////////////////////////////////////
		//練習問題/////////////////////////////////////////////////
//		Date now = new Date();
//		Calendar c = Calendar.getInstance();
//		c.setTime(now);
//		int day = c.get(Calendar.DAY_OF_MONTH);
//		day += 100;
//		c.set(Calendar.DAY_OF_MONTH, day);
//		Date future = c.getTime();
//		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//		System.out.println(f.format(future));
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime future = now.plusDays(100);
//		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(future.format(f));


		//練習問題/////////////////////////////////////////////////

	}

}
