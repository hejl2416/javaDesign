package le.pattern.singleton;

public class Singleton2 {

    //私有构造方法
    private Singleton2() {}

    private static volatile Singleton2 instance;

    //对外提供静态方法获取该对象
    public static Singleton2 getInstance() {

        if(instance != null) {
            return instance;
        }

        synchronized (Singleton2.class) {
            if(instance != null) {
                return instance;
            }
            instance = new Singleton2();
            return instance;
        }
    }
}
