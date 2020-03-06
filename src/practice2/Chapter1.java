package practice2;

public class Chapter1 {

	public static void main(String[] args) {
		//1-1//////////////////////////////////////////////////////
//		String s1 = "スッキリJava";
//		String s2 = "Java";
//		String s3 = "java";
//		if (s2.equals(s3)) {
//			System.out.println("s2とs3は等しい");
//		}
//		if (s2.equalsIgnoreCase(s3)) {
//			System.out.println("s2とs3はケースを区別しなければ等しい");
//		}
//		System.out.println("s1の長さは" + s1.length() + "です");
		//1-1//////////////////////////////////////////////////////
		//1-2//////////////////////////////////////////////////////
//		String s1 = "Java and JavaScript";
//		if (s1.contains("Java")){
//			System.out.println("s1はJavaを含んでいます。");
//		}
//		if (s1.endsWith("Java")) {
//			System.out.println("s1はJavaで終わります。");
//		}
//		System.out.println("s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
//		System.out.println("s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
		//1-2//////////////////////////////////////////////////////
		//1-3//////////////////////////////////////////////////////
//		String s1 = "Java programming";
//		System.out.println("s1の4文字目以降は" + s1.substring(3));
//		System.out.println("s1の4~7文字目は" + s1.substring(3, 8));
		//1-3//////////////////////////////////////////////////////
		//1-7//////////////////////////////////////////////////////
//		String s = "abc,def:ghi";
//		String[] words = s.split("[,:]");
//		for(String w : words) {
//			System.out.print(w + "->");
//		}
		//1-7//////////////////////////////////////////////////////
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append(i + 1 + ",");
		}
		String s = sb.toString();
		System.out.println(s);
		String[] numbers = s.split("[,]");
		for (String n: numbers) {
			System.out.println(n);
		}
	}

}
