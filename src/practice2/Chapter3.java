package practice2;
import java.util.HashMap;
import java.util.Map;
public class Chapter3 {
	public static void main(String[] args) {
		//3-1//////////////////////////////////////////////
//		ArrayList<Integer> points = new ArrayList<>();
//		points.add(10);
//		points.add(80);
//		points.add(70);
//		for (int p : points) {
//			System.out.println(p);
//		}
		//3-1//////////////////////////////////////////////
		//3-2//////////////////////////////////////////////
//		ArrayList<String> names = new ArrayList<>();
//		names.add("ミナト");
//		names.add("アサカ");
//		names.add("スガワラ");
//		Iterator<String> it = names.iterator();
//		while(it.hasNext()) {
//			String s = it.next();
//			System.out.println(s);
//		}
		//3-2//////////////////////////////////////////////
		//3-4//////////////////////////////////////////////
//		Set<String> colors = new HashSet<>();
//		colors.add("赤");
//		colors.add("青");
//		colors.add("黄");
//		colors.add("赤");
//		System.out.println(colors.size());
//		for (String s :colors) {
//			System.out.println(s);
//		}
		//3-4//////////////////////////////////////////////
		//3-7//////////////////////////////////////////////
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都");
		System.out.println(tokyo);
		prefs.remove("京都府");
		prefs.put("熊本県", 182);
		int kumamoto = prefs.get("熊本県");
		System.out.println(kumamoto);
		System.out.println(prefs.size());
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + ":" + value);

		}
		//3-7//////////////////////////////////////////////
	}
}
