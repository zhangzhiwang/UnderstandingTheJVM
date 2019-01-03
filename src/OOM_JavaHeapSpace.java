import java.util.ArrayList;
import java.util.List;

/**
 * 模拟堆内存溢出
 *
 * @author zhangzhiwang
 * @date 2018年7月1日 下午7:17:51
 */
public class OOM_JavaHeapSpace {
	public static void main(String[] args) {
		List<byte[]> list = new ArrayList<>();
		while(true) {
			list.add(new byte[1 * 1024 * 1024]);
		}
	}
}
