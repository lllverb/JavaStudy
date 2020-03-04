package practice1;

public class Chapter5_1 {
	public static void main(String[] args) {
		introduceOneself();
		email("タイトル", "アドレス", "テキスト");
		email("タイトル", "テキスト");
		calcTriangleArea(10.0, 5.0);
		calcCircleArea(5.0);
	}
	public static void introduceOneself() {
		String name = "大輝";
		int age = 23;
		double height = 186.2;
		char sex = '男';
		System.out.println(name + age + height + sex);
	}
	public static void email(String title, String address, String text) {
		System.out.println(title + ":" + address + ":" + text);
	}
	public static void email(String title, String text) {
		System.out.println(title + ":無題:" + text);
	}
	public static double calcTriangleArea(double bottom, double height) {
		double result = bottom * height /2;
		System.out.println("面積は" + result);
		return result;
	}
	public static double calcCircleArea(double radius) {
		double result = radius * radius * 3.14;
		System.out.println("面積は" + result);
		return result;
	}
}
