package standardClass;

public class Chapter15_2 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch(NullPointerException e){
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("スタックトレースここから");
			e.printStackTrace();
			System.out.println("スタックトレースここまで");
		}
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException nfex) {
			System.out.println("NumberFormatException例外をcatchしました");
		}
	}
}
