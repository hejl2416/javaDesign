package le.pattern.singleton;

import java.lang.reflect.Constructor;

public class SingletonReflection {
    public static void main(String[] args) throws Exception {
        //1.获取Singleton的字节码对象
        Class clazz = Singleton2.class;
        //2.获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        //3.取消访问检查
        cons.setAccessible(true);
        //4.创建Singleton对象
        Singleton2 o1 = (Singleton2) cons.newInstance();
        Singleton2 o2 = (Singleton2) cons.newInstance();
        System.out.println(o1 == o2);
    }
}
