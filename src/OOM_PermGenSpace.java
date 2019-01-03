
/**
 * 模拟方法区溢出
 *
 * @author zhangzhiwang
 * @date 2018年7月14日 下午12:00:35
 */
public class OOM_PermGenSpace {
	public static void main(String[] args) {
		//测试时将-XX:PermSize和-XX:MaxPermSize都设置为2m
		while(true) {
			CglibTest.createNewClassRuntime();
		}
	}
}
