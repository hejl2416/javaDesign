package le.principle.demo4;

import java.lang.reflect.Method;

public class Demo4Test {

    public static void main(String[] args) throws Exception {
        BaiMaSafetyDoor baiMaSafetyDoor = new BaiMaSafetyDoor();
        Method[] declaredMethods = baiMaSafetyDoor.getClass().getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            declaredMethod.invoke(baiMaSafetyDoor);
        }
        HeiMaSafetyDoor heiMaSafetyDoor = new HeiMaSafetyDoor();
        Method[] declaredMethods1 = heiMaSafetyDoor.getClass().getDeclaredMethods();
        for (Method method : declaredMethods1) {
            method.invoke(heiMaSafetyDoor);
        }
    }
}
