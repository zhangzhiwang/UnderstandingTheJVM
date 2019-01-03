
/**
 * 对象在finalize()方法中自我复活
 *
 * @author zhangzhiwang
 * @date 2018年7月14日 下午4:07:25
 */
public class FinalizeEscapeGC {
	private static FinalizeEscapeGC f;

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("执行finalize()方法");
		f = this;
	}

	public static void main(String[] args) throws InterruptedException {
		f = new FinalizeEscapeGC();
		f = null;
		System.gc();
		Thread.sleep(1000);

		if (f == null) {
			System.out.println("f被回收");
		} else {
			System.out.println("f复活");
		}
		System.out.println(f);
		System.out.println("----------");

		f = null;
		System.gc();
		Thread.sleep(1000);

		if (f == null) {
			System.out.println("f被回收");
		} else {
			System.out.println("f复活");
		}

	}
}
