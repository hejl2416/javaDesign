package le.pattern.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton() {
    }

    private static volatile Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
