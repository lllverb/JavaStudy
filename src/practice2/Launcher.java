package practice2;
import java.lang.reflect.Method;
public class Launcher {
//	public static void main(String[] args) throws Exception {
//		String fqcn = args[0];
//		String how = args[1];
//		try {
//			Class<?> c = Class.forName(fqcn);
//			System.out.println(c.getDeclaredMethods());
//			if (how.equals("E")){
//				ProcessBuilder pb = new ProcessBuilder();
//			}
//			if (how.equals("I")) {
//				Class clazz = Class.forName(fqcn);
//				Method mtd = clazz.getDeclaredMethod();
//
//			}
//		} finally {
//
//		}
//
//	}
	public static void main(String[] args) {
		String fqcn = args[0];
		String sw = args[1];
//		showMemory();
		try {
			Class<?> clazz = Class.forName(fqcn);
			listMethods(clazz);
			if(sw.equals("")) {
				launchExternal(clazz);
			} else if (sw.equals("I")) {
				launchInternal(clazz);
			} else {
				throw new IllegalArgumentException("起動方法の指定が不定です");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
		showMemory();
		System.exit(0);
	}
	public static void listMethods(Class<?> clazz){
		System.out.println("メソッドの一覧を表示します。");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}
	public static void launchExternal(Class<?> clazz) throws Exception{
		ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
		Process proc = pb.start();
		proc.waitFor();
	}
	public static void launchInternal(Class<?> clazz) throws Exception {
		Method m = clazz.getMethod("main", String[].class);
		String[] args = {};
		m.invoke(null,  (Object)args);
	}
	public static void showMemory() {
		long free = Runtime.getRuntime().freeMemory();
		long total = Runtime.getRuntime().totalMemory();
		long usage = (total - free)/1024/1024;
		System.out.println("現在のメモリの使用量" + usage + "MB");
	}
}
