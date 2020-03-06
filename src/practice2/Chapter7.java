package practice2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class Chapter7 {

	public static void main(String[] args) throws Exception {
//		Class<?> info1 = String.class;
//		System.out.println(info1.getSimpleName());
//		System.out.println(info1.getName());
//		System.out.println(info1.getPackageName());
//		System.out.println(info1.isArray());
//		Class<?> info2 = info1.getSuperclass();
//		System.out.println(info2.getName());
//		Class<?> info3 = args.getClass();
//		System.out.println(info3.isArray());
		Class clazz = RefSample.class;
		Constructor<?> cons = clazz.getConstructor(int.class);
		RefSample rs = (RefSample) cons.newInstance(256);
		Field f = clazz.getField("times");
		f.set(rs,  2);
		System.out.println(f.get(rs));
		Method m = clazz.getMethod("hello", String.class, int.class);
		m.invoke(rs,  "reflection!", 128);
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(m.getModifiers());
	}

}
