
/**
 * 对String的理解
 *
 * @author zhangzhiwang
 * @date 2018年7月14日 上午10:53:37
 */
public class AboutString {
	public static void main(String[] args) {
		// 对String的理解可参考：https://blog.csdn.net/soonfly/article/details/70147205
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1 == s2 ? --> " + (s1 == s2));
		System.out.println("s1.intern() == s2.intern() ? --> " + (s1.intern() == s2.intern()));
		
		String s3 = "aaa";
		String s4 = "aaa";
		System.out.println("s3 == s4 ? --> " + (s3 == s4));
		
		String s5 = new String("bbb");
		String s6 = "bbb";
		System.out.println("s5 == s6 ? --> " + (s5 == s6));
		System.out.println("s5.intern() == s6 ? --> " + (s5.intern() == s6));
		
		String s7 = "ccc";
		String s8 = new String("ccc");
		System.out.println("s7 == s8 ? --> " + (s7 == s8));
		System.out.println("s7 == s8.intern() ? --> " + (s7 == s8.intern()));
		System.out.println("s8 == s8.intern() ? --> " + (s8 == s8.intern()));
	}
}
