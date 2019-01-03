
/**
 * 模拟栈溢出
 *
 * @author zhangzhiwang
 * @date 2018年7月1日 下午7:54:08
 */
public class StackOverflowError {
	private static int count;
	
	public static void main(String[] args) {
		//测试时将-Xss调小
		try {
//			met1();//通过增加栈深度来达到栈溢出
			met2((byte)123,(short)1,1,1L,'a',true,1.0f,1.0);//通过增加局部变量表的长度来达到栈溢出
		} catch (Throwable e) {
			System.out.println("栈深度 = " + count);
			throw e;
		}
	}
	
	public static void met1() {
		count++;
		met1();
	}
	
	public static void met2(byte b, short s, int i, long l, char c, boolean bb, float f, double d) {
		byte b1 = 123;
		short s1 =-100;
		int i1 = 100; 
		long l1 = 100L;
		char c1 = 'a';
		boolean bb1 = true;
		float f1 = 1.0f;
		double d1 = 1.0;
		count++;
		met2(b1, s1, i1, l1, c1, bb1, f1, d1);
	}
}
