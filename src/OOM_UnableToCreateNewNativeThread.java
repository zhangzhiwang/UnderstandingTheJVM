import java.util.ArrayList;
import java.util.List;

/**
 * 模拟由于线程过多导致OOM，不能在创建新的线程
 *
 * @author zhangzhiwang
 * @date 2018年7月10日 上午8:10:07
 */
public class OOM_UnableToCreateNewNativeThread {
	public static void main(String[] args) {
		//虚拟机栈的空间越大，可创建的线程数越少，所以要调大-Xss的值。实际测试并未抛出java.lang.OutOfMemoryError:unable to create new native thread，但是cpu耗尽了
		while(true) {
			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
//					List<byte[]> list = new ArrayList<>();
					while(true) {
//						list.add(new byte[1 * 1024 * 1024]);
					}
				}
				
			});
			thread.start();
		}
	}
}
