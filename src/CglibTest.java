import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Cglib测试类
 *
 * @author zhangzhiwang
 * @date 2018年7月14日 上午11:56:04
 */
public class CglibTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {
		createNewClassRuntime();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void createNewClassRuntime() {
		try {
			// 设置类成员属性
			Map propertyMap = new HashMap();

			propertyMap.put("age", Class.forName("java.lang.Integer"));

			propertyMap.put("name", Class.forName("java.lang.String"));

			// 生成动态 Bean
			CglibBean bean = new CglibBean(propertyMap);

			// 给 Bean 设置值
			bean.setValue("age", new Integer(12));
			bean.setValue("name", "hello");
			
			// 从 Bean 中获取值，当然了获得值的类型是 Object
			// System.out.println(" >> id = " + bean.getValue("age"));
			// System.out.println(" >> name = " + bean.getValue("name"));

			// 获得bean的实体
			// Object object = bean.getObject();

			// 通过反射查看所有方法名
			// Class clazz = object.getClass();
			// Method[] methods = clazz.getDeclaredMethods();
			// for (int i = 0; i < methods.length; i++) {
			// System.out.println(methods[i].getName());
			// }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}